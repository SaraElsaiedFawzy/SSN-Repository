package com.ssn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssn.PlayLoad.ListResponse;
import com.ssn.dto.CityDto;
import com.ssn.dto.UserClassDto;
import com.ssn.serviceimpl.CityServiceImpl;
import com.ssn.serviceimpl.UserClassServiceImpl;

@RestController
@RequestMapping("${api.prefix.ssn}" + "/class")
public class UserClassController {
	@Autowired
	UserClassServiceImpl classServiceImpl;
	
	@GetMapping
	public ListResponse<UserClassDto> getAll(){
		return classServiceImpl.getAll();
	}
	
	@PostMapping
	public UserClassDto save(@RequestBody UserClassDto  classDto) {
		return classServiceImpl.save(classDto);
	}
	
	@GetMapping("/{id}")
	public UserClassDto getById(@PathVariable(value = "id") Long id) {
		return classServiceImpl.getById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable(value = "id") Long id) {
		classServiceImpl.delete(id);
	}
	
	@PatchMapping("/{id}")
	public UserClassDto update( @RequestBody UserClassDto classDto, @PathVariable(value = "id") Long id) throws Exception {
		return classServiceImpl.update(classDto, id);
	}
	

}
