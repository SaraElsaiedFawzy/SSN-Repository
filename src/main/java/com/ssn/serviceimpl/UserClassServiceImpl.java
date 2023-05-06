package com.ssn.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssn.PlayLoad.ListResponse;
import com.ssn.common.UserClass;
import com.ssn.dao.UserClassDao;
import com.ssn.dto.UserClassDto;
import com.ssn.exception.NotFoundException;
import com.ssn.mapper.UserClassMapper;
import com.ssn.service.UserClassService;

@Service
public class UserClassServiceImpl implements UserClassService {
	@Autowired
	UserClassMapper userClassMapper;
	@Autowired
	UserClassDao userClassDao;

	@Override
	public ListResponse<UserClassDto> getAll() {
 		return new ListResponse<>(userClassMapper.listToDto(userClassDao.findAll()));

	}

	@Override
	public UserClassDto getById(Long id) {
		return userClassMapper
				.entityToDto(userClassDao.findById(id).orElseThrow(() -> new NotFoundException("no id founded", "class-01")));
	}

	@Override
	public UserClassDto save(UserClassDto userClassDto) {
		UserClass userClass = userClassMapper.dtoToEntity(userClassDto);
		userClass = userClassDao.save(userClass);
		return userClassMapper.entityToDto(userClass);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		userClassDao.deleteById(id);
		
	}

	@Override
	public UserClassDto update(UserClassDto userClassDto, Long id) throws Exception {
		// TODO Auto-generated method stub
		UserClass userClass=userClassDao.findById(id).orElseThrow(() -> new NotFoundException("no id founded", "class-01"));
		userClassMapper.updateEntityFromDto(userClassDto, userClass);
		userClass = userClassDao.save(userClass);
		return userClassMapper.entityToDto(userClass);
	}

}
