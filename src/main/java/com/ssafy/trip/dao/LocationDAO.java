package com.ssafy.trip.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.ssafy.trip.dto.AttractionSidoGugunDTO;
import com.ssafy.trip.dto.LocationDTO;
import com.ssafy.trip.util.MyException;

@Mapper
@Repository
public interface LocationDAO {

	// 관광지 정보를 가져오는 메소드
	public LocationDTO getLocation(AttractionSidoGugunDTO attractionSidoGugunDTO) throws MyException;
	public ArrayList<LocationDTO> getLocationSido() throws MyException;
	public ArrayList<LocationDTO> getLocationGugun(AttractionSidoGugunDTO attractionSidoGugunDTO) throws MyException ;

}
