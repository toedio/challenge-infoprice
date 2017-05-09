package com.br.testjava.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "com.br.testjava.domain" })
@EnableJpaRepositories(basePackages= { "com.br.testjava.dao" })
@ComponentScan(basePackages = { "com.br.testjava.controller", "com.br.testjava.service"})
public class main {
	public static void main (String[] args) {
		SpringApplication.run(main.class, args);		
	}
}
