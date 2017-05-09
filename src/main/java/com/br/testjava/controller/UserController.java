package com.br.testjava.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.br.testjava.dto.UserDto;
import com.br.testjava.service.UserService;

@Controller
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.POST, headers="Accept=application/json")
	@ResponseBody
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto user) {
		return new ResponseEntity<UserDto>(userService.create(user), HttpStatus.OK);		
	}
	
	@RequestMapping(method=RequestMethod.GET, headers="Accept=application/json")
	@ResponseBody
	public ResponseEntity<List<UserDto>> listAll() {
		List<UserDto> list = userService.findAll();
		return new ResponseEntity<List<UserDto>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value="{userId}", method=RequestMethod.PUT, headers="Accept=application/json")
	public ResponseEntity<UserDto> update(@PathVariable long userId, @RequestBody UserDto user) {
		UserDto userDto = userService.update(userId, user);
		if (userDto == null)
			return new ResponseEntity<UserDto>(HttpStatus.BAD_REQUEST);
		else
			return new ResponseEntity<UserDto>(userDto, HttpStatus.OK);
	}
	
	@RequestMapping(value="{userId}", method=RequestMethod.GET, headers="Accept=application/json")
	public ResponseEntity<UserDto> update(@PathVariable long userId) {		
		return new ResponseEntity<UserDto>(userService.find(userId), HttpStatus.OK);
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="{userId}", method=RequestMethod.DELETE, headers="Accept=application/json")
	public ResponseEntity delete(@PathVariable long userId) {
		userService.remove(userId);
		return new ResponseEntity(HttpStatus.OK);
	}
}
