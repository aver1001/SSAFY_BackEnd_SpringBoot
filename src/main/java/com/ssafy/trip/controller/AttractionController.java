package com.ssafy.trip.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.ssafy.trip.dto.AttractionDTO;
import com.ssafy.trip.dto.AttractionSidoGugunDTO;
import com.ssafy.trip.dto.LocationDTO;
import com.ssafy.trip.dto.MemberVO;
import com.ssafy.trip.service.AttractionInfoService;
import com.ssafy.trip.util.MyException;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/attraction")
public class AttractionController {
	
	@Autowired
	AttractionInfoService attractionInfoService;
	@PostMapping("getAttractionInfoList")
	@ResponseBody
	//String sido_code,String gugun_code,String searchContentId
	public Map<String, String> getAttractionInfoList(@RequestBody AttractionSidoGugunDTO sidoGugun) throws NumberFormatException, MyException {
		Map<String, String> ret = new HashMap<String, String>();
		ArrayList<AttractionDTO> arrayList = new ArrayList<>();
		arrayList = attractionInfoService.getAttractionInfoList(sidoGugun);
		if(arrayList == null && arrayList.size() == 0) {
			ret.put("error", "데이터를 가져오지 못했습니다.");
		}
		else {
			Gson gson = new Gson();
			ret.put("attraction", gson.toJson(arrayList));
			ret.put("ok", "관광지 " + arrayList.size() + "개 반환");	
		}
		return ret;
	}
	
	@PostMapping("getAttractionInfo")
	@ResponseBody
	public Map<String, String> getAttractionInfo(String sido_code,String gugun_code) throws NumberFormatException, MyException {
		Map<String, String> ret = new HashMap<String, String>();
		AttractionDTO attractionInfo = attractionInfoService.getAttractionInfo(new AttractionSidoGugunDTO(Integer.parseInt(sido_code), 
				Integer.parseInt(gugun_code)));
		if(attractionInfo == null) {
			ret.put("error", "데이터를 가져오지 못했습니다.");
		}
		else {
			Gson gson = new Gson();
			ret.put("attraction", gson.toJson(attractionInfo));
			ret.put("ok", "관광지 반환");	
		}
		return ret;
	}
	
	@PostMapping("getLocation")
	@ResponseBody
	public Map<String, String> getLocation(String sido_code,String gugun_code) throws NumberFormatException, MyException {
		
		Map<String, String> ret = new HashMap<String, String>();
		LocationDTO locationDTO = attractionInfoService.getLocationInfo(new AttractionSidoGugunDTO(Integer.parseInt(sido_code),
				Integer.parseInt(gugun_code)));
		if(locationDTO == null) {
			ret.put("error", "데이터를 가져오지 못했습니다.");
		}
		else {
			Gson gson = new Gson();
			ret.put("attraction", gson.toJson(locationDTO));
			ret.put("ok", "관광지 반환");	
		}
		return ret;
	}
	
	@PostMapping("getSido")
	@ResponseBody
	public Map<String, String> getSido() throws NumberFormatException, MyException {
		Map<String, String> ret = new HashMap<String, String>();
		ArrayList<LocationDTO> arrayList = new ArrayList<>();
		arrayList= attractionInfoService.getLocationSido();
		if(arrayList == null) {
			ret.put("error", "데이터를 가져오지 못했습니다.");
		}
		else {
			Gson gson = new Gson();
			ret.put("location", gson.toJson(arrayList));
			ret.put("ok", "위치 반환");	
		}
		return ret;
	}
	
	
	@PostMapping("getGugun")
	@ResponseBody
	public Map<String, String> getGugun(@RequestBody String sido_code) throws NumberFormatException, MyException {
		sido_code = sido_code.replaceAll("\"", "");
		Map<String, String> ret = new HashMap<String, String>();
		ArrayList<LocationDTO> arrayList = new ArrayList<>();
		arrayList= attractionInfoService.getLocationGugun(new AttractionSidoGugunDTO(Integer.parseInt(sido_code)));
		if(arrayList == null) {
			ret.put("error", "데이터를 가져오지 못했습니다.");
		}
		else {
			Gson gson = new Gson();
			ret.put("location", gson.toJson(arrayList));
			ret.put("ok", "위치 반환");	
		}
		return ret;
	}
	
	
}
