package com.ssn.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
@Data
 @JsonIgnoreProperties(ignoreUnknown = true)
public class UserDataDto {
    private long id;
    private String firstName;
    private String secondName;
    private String courseType;
    private String courseName;
//	public long getId() {
//		return id;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public String getSecondName() {
//		return secondName;
//	}
//	public String getCourseType() {
//		return courseType;
//	}
//	public String getCourseName() {
//		return courseName;
//	}
//    
    


}
