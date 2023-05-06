package com.ssn.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;

import com.ssn.common.UserCourse;
import com.ssn.dto.UserCourseDto;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)

public interface UserCourseMapper extends BasicMapper<UserCourse, UserCourseDto> {
// 	@Mapping(source = "userTypeId", target = "userType.id")
//	UserCourse dtoToEntity(UserCourseDto userDto);
// 	@Override
//	@Mapping(source = "userTypeId", target = "userType.id")
//	UserCourse dtoToEntity(UserCourseDto dto);
//	@Override
//	@Mapping(source = "userType.name", target = "userTypeName")
//	UserCourseDto entityToDto(UserCourse entity);

}
