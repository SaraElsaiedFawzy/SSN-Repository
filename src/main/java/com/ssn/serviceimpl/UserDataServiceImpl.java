package com.ssn.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssn.common.UserData;
import com.ssn.dao.UserDataDao;
import com.ssn.dto.UserDataDto;
import com.ssn.mapper.UserDataMapper;
import com.ssn.service.UserDataService;
import java.util.*;
@Service
public class UserDataServiceImpl implements UserDataService{

	@Autowired 
	UserDataMapper dataMapper;
	@Autowired
	UserDataDao dao;
	@Override
	public List<UserDataDto> getCourseType(String courseType) {
 		// TODO Auto-generated method stub
 		return	dataMapper.listToDto(dao.findByCourseType(courseType));
	}

}
