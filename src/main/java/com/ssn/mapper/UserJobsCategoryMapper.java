package com.ssn.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import com.ssn.common.UserJobsCategory;
import com.ssn.dto.UserJobsCategoryDto;
@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)

public interface UserJobsCategoryMapper extends BasicMapper<UserJobsCategory,UserJobsCategoryDto>{

}
