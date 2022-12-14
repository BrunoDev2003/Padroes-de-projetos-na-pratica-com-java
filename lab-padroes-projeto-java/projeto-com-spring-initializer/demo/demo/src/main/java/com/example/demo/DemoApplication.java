package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
 * Projeto Spring Boot gerado via Spring Initializer
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * Spring Web 
 * H2 Database 
 * OpenFeign
 * 
 * @author Bruno Mendonça Gusmão
 */

	@EnableFeignClients
	@SpringBootApplication

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
