package com.ssn.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserJobsCategoryDto {
	private Long id;
	private String name;
	private List<UserJobsDto> userJobsCollection;
 //	private List<User> userCollection;


}
