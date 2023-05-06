package com.ssn.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import com.ssn.common.UserSkills;
import com.ssn.dto.UserSkillsDto;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)

public interface UserSkillsMapper extends BasicMapper<UserSkills, UserSkillsDto> {

}
