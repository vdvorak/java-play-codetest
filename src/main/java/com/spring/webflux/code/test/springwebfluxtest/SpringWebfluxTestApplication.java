package com.spring.webflux.code.test.springwebfluxtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@Configuration
@ComponentScan
@EnableWebFlux
public class SpringWebfluxTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebfluxTestApplication.class, args);
	}
}
