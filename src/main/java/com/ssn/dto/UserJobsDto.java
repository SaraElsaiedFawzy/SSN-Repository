package com.ssn.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserJobsDto {
	private Long id;
	private String jobName;
	private String companyName;
	private String companyLocation;
	private String jobTitle;
	private String jobDescription;
    private boolean isTrainig;
    private boolean isPermenant;

//	private UserJobsCategoryDto catId;


}
