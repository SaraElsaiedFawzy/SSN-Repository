package com.ssn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${api.prefix.ssn}" + "/user/view")
public class UserCourseViewController {
//	@Autowired
//	UserCourseViewServiceImpl courseViewServiceImpl;
//	@GetMapping("/search")
//	public UserCourseViewDto search(@RequestParam(value = "courseType", required = false) String Type ) throws Exception {
//  		return courseViewServiceImpl.getUserCourse(Type);
//	}

}
