package com.ssn.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;

import com.ssn.common.CourseType;
import com.ssn.dto.CourseTypeDto;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)

public interface CourseTypeMapper extends BasicMapper<CourseType, CourseTypeDto> {

 

}
