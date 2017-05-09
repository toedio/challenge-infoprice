package com.br.testjava.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.testjava.domain.Address;

public interface AddressDAO extends JpaRepository<Address, Long> {

}
