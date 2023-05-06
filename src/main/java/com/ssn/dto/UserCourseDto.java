package com.ssn.dto;

 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserCourseDto {
	private Long id;
 	private String name;  
 	private String description;
 	private CourseTypeDto userType;
// 	private long userTypeId;
// 	private String userTypeName;
// 	private List<CourseTypeDto> userType;
// 	private  CourseTypeDto user;
 


}
