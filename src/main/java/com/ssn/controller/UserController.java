package com.ssn.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssn.PlayLoad.ListResponse;
import com.ssn.common.User;
import com.ssn.dto.User2Dto;
import com.ssn.dto.UserDto;
import com.ssn.dto.UserJobsCategoryDto;
import com.ssn.serviceimpl.UserServiceImpl;

@RestController
@RequestMapping("${api.prefix.ssn}" + "/user")
public class UserController {
	@Autowired
	UserServiceImpl userServiceImpl;
	@GetMapping
	public ListResponse<UserDto> getAllUsers(){
		System.out.println("Get All ");
		return userServiceImpl.getAll();
	}
	
	
	@GetMapping("/uu")
	public String getus(){
		return "Hallo from other side ::";
	}

	@PostMapping
	public UserDto saveUser(@RequestBody UserDto userDto) throws Exception {
		return userServiceImpl.save(userDto);
	}
	
	@GetMapping("/{id}")
	public UserDto getUserById(@PathVariable(value = "id") Long id) {
		return userServiceImpl.getById(id);
	}
	
//	@GetMapping("/signIn")
//	public UserDto signUp(@RequestParam(value = "nPass") String nPass, @RequestParam(value = "emailOrPhone") String emailOrPhone) {
//		System.out.println("Hallo from sign in");
//		return userServiceImpl.signIn(nPass, emailOrPhone);
//	}
//	
	@GetMapping("/signIn")
	public UserDto signUp(@RequestParam(value = "emailOrPhone", required = false) String emailOrPhone,@RequestParam(value = "nPass",required = false) String nPass ) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		System.out.println("Sign in :: "+ dateFormat.format(cal.getTime()));
 		return userServiceImpl.signIn(emailOrPhone,nPass);
	}
	@DeleteMapping("/{id}")
	public void deleteUserById(@PathVariable(value = "id") Long id) {
		userServiceImpl.delete(id);
	}
	
	@PatchMapping("/{id}")
	public UserDto updateUser( @RequestBody UserDto userDto, @PathVariable(value = "id") Long id) throws Exception {
		return userServiceImpl.update(userDto, id);
	}
	
	@GetMapping("/getuserdata")
	public User2Dto userData( @RequestParam(value = "courseType") String courseType) throws Exception {
  		return userServiceImpl.getUserCourse(courseType);
	}
	
	@GetMapping("getuserjobs")
	public  List<UserDto>  userJobs( @RequestParam(value = "job_name") String job_name) throws Exception {
		System.out.println("Job_________Name :: "+ job_name);
  		return userServiceImpl.getUserJobsAndTraining( job_name);
	}

}
