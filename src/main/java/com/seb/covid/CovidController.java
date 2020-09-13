package com.seb.covid;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CovidController {
    @RequestMapping("/")
	public String index() throws Exception {
        ICovidService covidService = ServiceFactory.getCovidService();
        CovidResult result = covidService.getCovidResult(
			CovidRegionEnum.CapitaleNationale);

        return "NBR CAS: " + result.getNbrInfected() + 
                    " -- NBR mort capitale nationale: " + result.getNbrDeath();
	}
}
