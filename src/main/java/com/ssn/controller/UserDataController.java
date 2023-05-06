package com.ssn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssn.dto.UserDataDto;
import com.ssn.serviceimpl.UserDataServiceImpl;
import java.util.*;
@RestController
@RequestMapping("${api.prefix.ssn}" + "/user/view")
public class UserDataController {
	@Autowired
	UserDataServiceImpl dataServiceImpl;
	@GetMapping()
	public List<UserDataDto> search(@RequestParam(value = "courseType", required = false) String courseType ) throws Exception {
  		return dataServiceImpl.getCourseType(courseType);
	}

}
