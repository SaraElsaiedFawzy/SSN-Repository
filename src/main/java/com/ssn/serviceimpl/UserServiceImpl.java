package com.ssn.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssn.PlayLoad.ListResponse;
import com.ssn.common.User;
import com.ssn.dao.CityDao;
import com.ssn.dao.CourseTypeDao;
import com.ssn.dao.User2Dao;
import com.ssn.dao.User3Dao;
import com.ssn.dao.UserDao;
import com.ssn.dao.UserJobsCategoryDao;
import com.ssn.dao.UserJobsDao;
import com.ssn.dto.User2Dto;
import com.ssn.dto.UserDto;
import com.ssn.exception.NotFoundException;
import com.ssn.mapper.User2Mapper;
import com.ssn.mapper.UserJobsCategoryMapper;
import com.ssn.mapper.UserMapper;
import com.ssn.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;
	@Autowired
	UserDao userDao;
	@Autowired
	CityDao cityDao;
	@Autowired
	CourseTypeDao courseTypeDao;
	@Autowired
	User2Mapper user2Mapper;
	@Autowired
	User2Dao user2Dao;
	@Autowired
	UserJobsCategoryDao userJobsCategoryDao;
	@Autowired
	UserJobsCategoryMapper userJobsCategoryMapper;
	@Autowired
	UserJobsDao userJobsdao;
	@Autowired
	User3Dao user3Dao;
	
 

	@Override
	public ListResponse<UserDto> getAll() {
	   
 		return new ListResponse<>(userMapper.listToDto(userDao.findAll()));
	}

	@Override
	public UserDto getById(Long id) {
		return userMapper
				.entityToDto(userDao.findById(id).orElseThrow(() -> new NotFoundException("no id founded", "user-01")));
	}

	@Override
	public UserDto save(UserDto userDto) throws Exception {
		User user = userMapper.dtoToEntity(userDto);
//		City city = cityDao.findById(userDto.getCityId())
//				.orElseThrow(() -> new Exception("no city founded!"));
//		if (userDto.getCityId() != null) {
//			 user.setCity(city);
//		}
		if (!user.getNPass().equals(user.getCPass())) {
			throw new Exception("Enter Vaild pass");
		}
		user = userDao.save(user);
		return userMapper.entityToDto(user);
	}

	@Override
	public void delete(Long id) {
		userDao.deleteById(id);

	}

	@Override
	public UserDto update(UserDto userDto, Long id) throws Exception {
		User user = userDao.findById(id).orElseThrow(() -> new NotFoundException("no id founded", "user-01"));
		userMapper.updateEntityFromDto(userDto, user);
		user = userDao.save(user);
		return userMapper.entityToDto(user);
	}

	@Override
	public UserDto signIn( String emailOrPhone,String nPass) {
		
		
		System.out.println("Before s IN Sign In");
		User user = userDao.findUserByNPassAndEmailOrPhone(nPass, emailOrPhone);
		System.out.println("IN Sign In");
		System.out.println("USer Details"+ user.getNPass() + " " + user.getEmailOrPhone());
	return	userMapper.entityToDto(userDao.findUserByNPassAndEmailOrPhone(nPass, emailOrPhone));
 	}

	@Override
	public User2Dto getUserCourse(String type ) throws Exception {
		// TODO Auto-generated method stub
		return	user2Mapper.entityToDto(user2Dao.searchCourseName(type));
	}

	@Override
	public List<UserDto> getUserJobsAndTraining(String job_name) throws Exception {
		// TODO Auto-generated method stub
		 
		return	userMapper.listToDto(user3Dao.searchJosAndTraninges(job_name));
	}
	
 
         

  


	 

}
