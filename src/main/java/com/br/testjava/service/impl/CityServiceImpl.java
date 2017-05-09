package com.br.testjava.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.testjava.dao.CityDAO;
import com.br.testjava.domain.City;
import com.br.testjava.dto.CityDto;
import com.br.testjava.service.CityService;

@Service	
public class CityServiceImpl implements CityService {

	@Autowired
	CityDAO cityDao;
	
	@Override
	public List<CityDto> findAll() {
		List<City> cityList = cityDao.findAll();
		List<CityDto> cityDtoList = new ArrayList<CityDto>();
		for (City city : cityList)
			cityDtoList.add(new CityDto(city));
		return cityDtoList;
	}

}
