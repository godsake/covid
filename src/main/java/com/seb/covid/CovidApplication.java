package com.seb.covid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CovidApplication {

	public static void main( String[] args) {
		ICovidService covidService = ServiceFactory.getCovidService();
		System.out.println("RES: " + covidService.getCovidResult(
			CovidRegionEnum.CENTRE_QUEBEC).getNbrDeath());

		SpringApplication.run(CovidApplication.class, args);
	}

}
