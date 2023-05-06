package com.ssn.service;

import java.util.List;

import com.ssn.PlayLoad.ListResponse;
import com.ssn.dto.User2Dto;
import com.ssn.dto.UserDto;

public interface UserService {
	ListResponse<UserDto> getAll();
	UserDto getById(Long id);
	UserDto save(UserDto userDto) throws Exception;
	void delete(Long id);
	UserDto update(UserDto userDto, Long id) throws Exception;
	UserDto signIn(String emailOrPhone,String nPass);
	
	
	User2Dto getUserCourse(String type) throws Exception;
	
	List<UserDto> getUserJobsAndTraining(String job_name) throws Exception;
 
}
