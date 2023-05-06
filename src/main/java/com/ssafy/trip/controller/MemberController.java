package com.ssafy.trip.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.ssafy.trip.dto.MemberVO;
import com.ssafy.trip.service.MemberService;
import com.ssafy.trip.util.MyException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	
	@PostMapping(value="/memberInsert")
	@ResponseBody
	public Map<String, String> memberInsert(@RequestBody MemberVO member) {;
		Map<String, String> ret = new HashMap<>();
		try {
			memberService.memberInsert(member);
			ret.put("ok", "회원 가입 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ret.put("error", "회원 가입 실패");
		}
		return ret;
	}
	
	@PostMapping(value="/memberDelete")
	@ResponseBody
	public Map<String, String> memberDelete(@RequestBody String id,HttpServletRequest request) {
		Map<String, String> ret = new HashMap<>();
		MemberVO member = (MemberVO) request.getAttribute("memberVO");
		//요청하는 사람과 삭제하는 대상이 같을경우만 진행
		if (member!= null && member.getId().equals(id)){
			try {
				memberService.memberDelete(id);
				ret.put("ok", "회원 제거 성공");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				ret.put("error", "회원 제거 실패");
			}
		}
		return ret;
	}
	
	@PostMapping(value="/memberModify")
	@ResponseBody
	public Map<String, String> memberModify(@RequestBody MemberVO memberModifyVO,HttpServletRequest request) throws MyException {
		HttpSession session = request.getSession(false);
		Map<String, String> ret = new HashMap<String, String>();
	
		if(session == null) {
			ret.put("error", "세션 만료 다시 로그인 해주세요");
		//요청하는 사람과 수정하는 대상이 같을경우만 진행
		}else if (session.getAttribute("id") != memberModifyVO.getId()) {
			ret.put("error", "잘못된 접근입니다.");
		}
		else {
			MemberVO member = (MemberVO) session.getAttribute("memberVO");
			memberModifyVO.setId(member.getId());
			memberService.memberModify(memberModifyVO);
			ret.put("ok", "회원 수정 완료");
		}
		return ret;
	}
	
	@PostMapping(value="/login")
	@ResponseBody
	public Map<String, String> login(@RequestBody MemberVO member,HttpServletRequest request) throws MyException {
		MemberVO tmpMember = memberService.login(member);
		Map<String, String> ret = new HashMap<String, String>();
		
		if(tmpMember != null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("memberVO", member);
			ret.put("name", tmpMember.getName());
			ret.put("ok", "로그인 완료");
		}
		else {
			ret.put("error","다시 로그인 해주세요");
		}
		return ret;
	}
	
	@PostMapping(value="/getUser")
	@ResponseBody
	public Map<String, String> getUser(HttpServletRequest request) throws MyException {
		HttpSession session = request.getSession(false);
		Map<String, String> ret = new HashMap<String, String>();
		if(session == null) {
			ret.put("error", "세션 만료 다시 로그인 해주세요");
		}
		else {
			MemberVO member = (MemberVO) session.getAttribute("memberVO");
			MemberVO getMemberFromUser = memberService.getUser(member);
			Gson gson = new Gson();
			if(getMemberFromUser != null){
				ret.put("user", gson.toJsonTree(getMemberFromUser).toString());
				ret.put("ok", "회원 정보 확인 완료");
			}
			else {
				ret.put("error", "회원 조회 오류 다시 로그인 해주세요");
			}
		}
		
		return ret;
	}
	
	@PostMapping(value="/logout")
	@ResponseBody
	public Map<String, String> logout(HttpServletRequest request) throws MyException {
		HttpSession session = request.getSession(false);
		Map<String, String> ret = new HashMap<String, String>();
		if(session == null) {
			ret.put("error","로그아웃 실패");
		}
		else {
			session.invalidate();
		}
		return ret;
	}
	
}
