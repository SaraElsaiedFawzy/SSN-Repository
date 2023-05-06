package com.ssn.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssn.PlayLoad.ListResponse;
import com.ssn.common.CourseType;
import com.ssn.common.UserCourse;
import com.ssn.dao.CourseTypeDao;
import com.ssn.dao.UserCourseDao;
import com.ssn.dao.UserDao;
import com.ssn.dto.UserCourseDto;
import com.ssn.dto.UserDto;
import com.ssn.exception.NotFoundException;
import com.ssn.mapper.UserCourseMapper;
import com.ssn.mapper.UserMapper;
import com.ssn.service.UserCourseService;

@Service
public class UserCourseServiceImpl implements UserCourseService {

	@Autowired
	UserCourseMapper userCourseMapper;
	@Autowired
	UserCourseDao userCourseDao;
	@Autowired
	CourseTypeDao courseTypeDao;
	@Autowired
	UserMapper userMapper;
	@Autowired
	UserDao userDao;
 

	@Override
	public ListResponse<UserCourseDto> getAll() {
		return new ListResponse<>(userCourseMapper.listToDto(userCourseDao.findAll()));
	}

	@Override
	public UserCourseDto search(String courseName, String courseType) {
			System.out.println("Before search ");
 			Optional<UserCourse> cName = userCourseDao.findByNameContaining(courseName);
			Optional<CourseType> cType=courseTypeDao.findByNameContaining(courseType);
			if(cName.isPresent() && cType.isPresent()) {
	     	return userCourseMapper.entityToDto(userCourseDao.searchCourse(courseName, courseType));

			}else {
  			throw new NotFoundException("not founded course name or course type", "code 01 - 02");

			}
 		 
 	}

 

//	@Override
//	public UserCourseViewDto getUserCourse(String course_type) throws Exception{
//		
////		Optional<CourseType> cType=courseTypeDao.findByNameContaining(course_type);
//		System.out.println("Before user data ");
////		if(cType.isPresent()) {
//     	 
////			return courseViewMapper.entityToDto()
//			return courseViewMapper.entityToDto(userCourseViewDao.findByCourseTyping(course_type));
//
////		}else {
////			throw new NotFoundException("not founded course name or course type", "code 01 - 02");
////
////		}
//	}

}
