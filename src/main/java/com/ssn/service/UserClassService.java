package com.ssn.service;

import java.util.Optional;

import com.ssn.PlayLoad.ListResponse;
import com.ssn.dto.UserClassDto;
  
public interface UserClassService {
	
	
	ListResponse<UserClassDto> getAll();
	UserClassDto getById(Long id);
	UserClassDto save(UserClassDto userClassDto);
	void delete(Long id);
	UserClassDto update(UserClassDto userClassDto, Long id) throws Exception;

}
