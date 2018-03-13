package com.jarrodcodes.rollcallapi.rollcallapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing

public class RollCallApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RollCallApiApplication.class, args);
	}
}
