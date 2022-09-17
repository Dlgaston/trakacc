package com.trakacc.manapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.trakacc" )
public class ManAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManAppApplication.class, args);
	}

}
