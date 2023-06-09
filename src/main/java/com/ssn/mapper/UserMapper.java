package com.ssn.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;

import com.ssn.common.User;
import com.ssn.common.UserJobsCategory;
import com.ssn.dto.UserDto;
import com.ssn.dto.UserJobsCategoryDto;
@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)

public interface UserMapper extends BasicMapper<User, UserDto>{

	UserJobsCategoryDto entityToDto(UserJobsCategory searchJosAndTraninges);
//	@Override
//	@Mapping(source = "cityId", target = "city.id")
//	User dtoToEntity(UserDto userDto);
//	@Mapping(source = "city.id", target = "cityId")
//	UserDto entityToDto(User entity);

}
