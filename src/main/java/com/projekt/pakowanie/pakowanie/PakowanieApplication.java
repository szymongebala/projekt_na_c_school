package com.projekt.pakowanie.pakowanie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.projekt.pakowandie.pakowanie.controler"})
public class PakowanieApplication {

	public static void main(String[] args) {
		SpringApplication.run(PakowanieApplication.class, args);
	}




}
