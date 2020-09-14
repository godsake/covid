package com.seb.covid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CovidApplication {
	// docker run -dit covid
	// docker run --rm -d  -p 8080:3000/tcp covid:latest
	public static void main( String[] args) {
		SpringApplication.run(CovidApplication.class, args);
	}
}
