package com.br.testjava.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.testjava.domain.City;

public interface CityDAO extends JpaRepository<City, Long> {

}
