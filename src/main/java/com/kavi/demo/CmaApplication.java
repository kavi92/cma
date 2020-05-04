package com.kavi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmaApplication.class, args);
	}

}
