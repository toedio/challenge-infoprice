package com.br.testjava.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.br.testjava.dao.UserDAO;
import com.br.testjava.domain.User;

@Controller
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserDAO userDao;
	
	@RequestMapping(method=RequestMethod.POST, headers="Accept=application/json")
	@ResponseBody
	public User createUser(@RequestBody User user) {
		return userDao.save(user);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, headers="Accept=application/json")
	@ResponseBody
	public List<User> listAll() {
		return userDao.findAll();		
	}
}
