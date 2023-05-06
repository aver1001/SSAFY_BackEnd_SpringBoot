package com.ssafy.trip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.trip.dao.MemberDAO;
import com.ssafy.trip.dto.MemberVO;
import com.ssafy.trip.util.MyException;

@Service
public class MemberService {
	
	@Autowired
	MemberDAO memberDAO;

	// 유저 insert 하는 메소드
	public void memberInsert(MemberVO memberVO) throws MyException {
		// TODO Auto-generated method stub
		memberDAO.memberInsert(memberVO);
	}
	// 유저 로그인 하는 메소드
	public MemberVO login(MemberVO memberVO) throws MyException {
		// TODO Auto-generated method stub

		return memberDAO.login(memberVO);
	}
	// 유저 삭제하는 메소드
	public void memberDelete(String id) throws MyException {
		memberDAO.memberDelete(id);
	}
	// 유저 수정하는 메소드
	public void memberModify(MemberVO memberModifyVO) throws MyException {
		memberDAO.memberModify(memberModifyVO);
	}
	// 유저 정보 가져오는 메소드
	public MemberVO getUser(MemberVO memberVO) throws MyException {
		return memberDAO.getUser(memberVO);
	}

}
