package com.seb.covid;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CovidController {
    @RequestMapping("/")
	public String index() {
        ICovidService covidService = ServiceFactory.getCovidService();
		int res = covidService.getCovidResult(
			CovidRegionEnum.CENTRE_QUEBEC).getNbrDeath();
		return "Greetings from Spring Boot tutu! NBR: " + res;
	}
}
