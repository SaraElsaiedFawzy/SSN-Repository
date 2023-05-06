package com.ssn.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import com.ssn.common.UserOnlineCourses;
import com.ssn.dto.UserOnlineCoursesDto;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)

public interface UserOnlineCoursesMapper extends BasicMapper<UserOnlineCourses, UserOnlineCoursesDto> {

}
