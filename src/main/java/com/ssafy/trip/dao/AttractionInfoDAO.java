package com.ssafy.trip.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.ssafy.trip.dto.AttractionDTO;
import com.ssafy.trip.dto.AttractionSidoGugunDTO;
import com.ssafy.trip.util.MyException;

@Mapper
@Repository
public interface AttractionInfoDAO {
    
 
	// 관광지 정보를 가져오는 메소드
    public  ArrayList<AttractionDTO> getAttractionInfoList(AttractionSidoGugunDTO attractionSidoGugunDTO) throws MyException;
    
    // content_id로 데이터 조회하는 메소드
	public AttractionDTO getAttractionInfo(AttractionSidoGugunDTO attractionSidoGugunDTO) throws MyException;
}

