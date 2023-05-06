package com.ssn.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import com.ssn.common.UserClass;
import com.ssn.dto.UserClassDto;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)

public interface UserClassMapper extends BasicMapper<UserClass, UserClassDto> {

}
