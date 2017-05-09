package com.br.testjava.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.testjava.domain.User;

public interface UserDAO extends JpaRepository<User, Long>{

}
