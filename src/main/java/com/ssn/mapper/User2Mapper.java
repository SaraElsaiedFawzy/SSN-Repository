package com.ssn.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import com.ssn.common.User2;
import com.ssn.dto.User2Dto;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)

public interface User2Mapper   extends BasicMapper<User2 ,User2Dto> {
}
