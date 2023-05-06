package com.ssn.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ssn.common.UserCourse;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CourseTypeDto {
	private Long id;
	private String name;
	

}
