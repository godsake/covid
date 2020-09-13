package com.seb.covid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@Service
public class CovidApplication {

	public static void main( String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
			"META-INF/beans.xml");
		BeanFactory factory = context;
		ICovidService covidService = (ICovidService) factory.getBean("covidService");

		System.out.println("RES: " + covidService.getCovidResult(
			CovidRegionEnum.CENTRE_QUEBEC).getNbrDeath());

		SpringApplication.run(CovidApplication.class, args);
	}

}
