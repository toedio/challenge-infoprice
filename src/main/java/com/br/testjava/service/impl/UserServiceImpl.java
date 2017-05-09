package com.br.testjava.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.testjava.dao.UserDAO;
import com.br.testjava.domain.User;
import com.br.testjava.dto.UserDto;
import com.br.testjava.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO userDao;

	@Override
	public List<UserDto> findAll() {
		List<User> userList = userDao.findAll();
		List<UserDto> userDtoList = new ArrayList<UserDto>();
		for (User user : userList)
			userDtoList.add(new UserDto(user));
		return userDtoList;
	}

	@Override
	public UserDto find(Long userId) {
		return new UserDto(userDao.findOne(userId));
	}

	@Override
	public UserDto remove(Long userId) {
		userDao.delete(userId);
		return new UserDto();
	}
	
	@Override
	public UserDto create(UserDto userDto) {
		return new UserDto(userDao.save(new User(userDto)));
	}
	
	@Override
	public UserDto update(Long userId, UserDto userDto) {
		User user = userDao.findOne(userId);
		if (user == null) 
			return null;
		else {
			user.setName(userDto.getName());
			user.setEmail(userDto.getEmail());
			user.setAddress(userDto.getAddress());
			return new UserDto(userDao.save(user));			
		}		
		
	}

}
