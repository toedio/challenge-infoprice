package com.br.testjava.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.br.testjava.dao.CityDAO;
import com.br.testjava.domain.City;

@Controller
@RequestMapping("/api/cities")
public class CityController {
	@Autowired
	private CityDAO cityDao;
	

	@RequestMapping(method=RequestMethod.GET, headers="Accept=application/json")
	@ResponseBody
	public List<City> listAll() {
		return cityDao.findAll();		
	}
}
