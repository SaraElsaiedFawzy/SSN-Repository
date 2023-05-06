package com.ssn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssn.PlayLoad.ListResponse;
import com.ssn.dto.UserCourseDto;
import com.ssn.serviceimpl.UserCourseServiceImpl;

@RestController
@RequestMapping("${api.prefix.ssn}" + "/user/course")
public class UserCourseController {
	@Autowired
	UserCourseServiceImpl userCourseServiceImpl;
	@GetMapping
	public ListResponse<UserCourseDto> getAll(){
		System.out.println("Get All course ");
		return userCourseServiceImpl.getAll();
	}
	
	@GetMapping("/search")
	public UserCourseDto search(@RequestParam(value = "courseName", required = false) String courseName,@RequestParam(value = "courseType",required = false) String courseType ) {
  		return userCourseServiceImpl.search(courseName, courseType);
	}


}
