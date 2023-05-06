package com.ssn.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ssn.common.User;
import com.ssn.common.UserJobsCategory;

import java.util.*;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {
	private Long id;
	private String fName;
	private String lName;
	private String emailOrPhone;
	private String nPass;
	private String cPass;
	private String gender;
	private List<UserCourseDto> userCourse;
	private List<UserClassDto> userClass;
	private List<UserSkillsDto> userSkills;
	private List<UserOnlineCoursesDto> onlineCourse;
	private UserJobsCategoryDto userJobsCatId;
//	private Long cityId;
//	private CVBuilder user_id;

}
