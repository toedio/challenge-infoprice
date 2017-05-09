package com.br.testjava.service;

import java.util.List;

import com.br.testjava.dto.UserDto;

public interface UserService {

	List<UserDto> findAll();
	UserDto find(Long userId);
	UserDto remove(Long userId);
	UserDto create(UserDto userDto);	
	UserDto update(Long userId, UserDto userDto);
}
