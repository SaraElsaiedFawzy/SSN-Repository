package com.ssn.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import com.ssn.common.UserData;
import com.ssn.dto.UserDataDto;
@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)

public interface UserDataMapper extends BasicMapper<UserData, UserDataDto>{

}
