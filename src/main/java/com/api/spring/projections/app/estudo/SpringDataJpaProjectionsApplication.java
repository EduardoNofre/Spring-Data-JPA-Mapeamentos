package com.api.spring.projections.app.estudo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Micro Service projection ", version = "1.0",description = " Estudo rapido "))
public class SpringDataJpaProjectionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaProjectionsApplication.class, args);
	}

}
