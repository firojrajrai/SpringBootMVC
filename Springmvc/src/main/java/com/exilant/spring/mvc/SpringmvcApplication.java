package com.exilant.spring.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com"})
public class SpringmvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmvcApplication.class, args);
	}
}
