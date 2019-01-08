package com.wissensalt.rnd.springmapstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.wissensalt.rnd.springmapstruct")
@SpringBootApplication
public class SpringMapstructApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMapstructApplication.class, args);
	}

}

