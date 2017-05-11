package com.br.testjava.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.br.testjava.dto.CityDto;
import com.br.testjava.service.CityService;

@Controller
@RequestMapping("/api/cities")
public class CityController {
	
	@Autowired
	private CityService cityService;
	

	@RequestMapping(method=RequestMethod.GET, headers="Accept=application/json")
	@ResponseBody
	public ResponseEntity<List<CityDto>> listAll() {
		return new ResponseEntity<List<CityDto>>(cityService.findAll(), HttpStatus.OK);
	}
}
