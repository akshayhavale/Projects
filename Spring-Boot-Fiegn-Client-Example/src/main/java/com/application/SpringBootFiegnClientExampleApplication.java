package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootFiegnClientExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFiegnClientExampleApplication.class, args);
	}

}
