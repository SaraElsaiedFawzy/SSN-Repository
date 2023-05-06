package com.ssn.service;

import com.ssn.PlayLoad.ListResponse;
import com.ssn.dto.UserCourseDto;
 
public interface UserCourseService {
	
	
	ListResponse<UserCourseDto> getAll();
	 UserCourseDto search(String courseName, String courseType);
	
//	UserCourseDto getById(Long id);
//	CityDto save(CityDto cityDto);
//	void delete(Long id);
//	CityDto update(CityDto cityDto, Long id) throws Exception;

}
