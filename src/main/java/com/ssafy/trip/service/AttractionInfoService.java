package com.ssafy.trip.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.trip.dao.AttractionInfoDAO;
import com.ssafy.trip.dao.LocationDAO;
import com.ssafy.trip.dto.AttractionDTO;
import com.ssafy.trip.dto.AttractionSidoGugunDTO;
import com.ssafy.trip.dto.LocationDTO;
import com.ssafy.trip.util.MyException;

@Service
public class AttractionInfoService {

	@Autowired
	AttractionInfoDAO attractionInfoDAO;
	
	@Autowired
	LocationDAO locationDAO;

	// 관광지 정보를 가져오는 메소드
	public ArrayList<AttractionDTO> getAttractionInfoList(AttractionSidoGugunDTO attractionSidoGugunDTO) throws MyException {
		return attractionInfoDAO.getAttractionInfoList(attractionSidoGugunDTO);
	}
	// content_id로 데이터 조회하는 메소드
	public AttractionDTO getAttractionInfo(AttractionSidoGugunDTO attractionSidoGugunDTO) throws MyException {
		return attractionInfoDAO.getAttractionInfo(attractionSidoGugunDTO);
	}
	// 시도, 군구 정보로 위치 정보를 가져오는 메소드
	public LocationDTO getLocationInfo(AttractionSidoGugunDTO attractionSidoGugunDTO) throws MyException{
		return locationDAO.getLocation( attractionSidoGugunDTO);
	}
	// sido 정보 리스트를 가져오는 메소드
	public ArrayList<LocationDTO> getLocationSido() throws MyException{
		return locationDAO.getLocationSido();
	}
	// sido_code를 바탕으로 gungu 코드 리스트를 가져오는 메소드
	public ArrayList<LocationDTO> getLocationGugun(AttractionSidoGugunDTO attractionSidoGugunDTO) throws MyException{
		return locationDAO.getLocationGugun( attractionSidoGugunDTO);
	}
}
