package com.ssafy.trip.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.ssafy.trip.dto.MemberVO;
import com.ssafy.trip.util.MyException;


@Mapper
@Repository
public interface MemberDAO {

	public void memberInsert(MemberVO memberVO) throws MyException;

	public MemberVO login(MemberVO memberVO) throws MyException;

	public void memberDelete(String id) throws MyException;

	public void memberModify(MemberVO memberModifyVO) throws MyException;
	
	public MemberVO getUser(MemberVO memberVO) throws MyException;
}
