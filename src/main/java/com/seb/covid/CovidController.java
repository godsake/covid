package com.seb.covid;

import com.seb.services.*;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CovidController {
    // @Autowired()
    // private ICovidService covidService;

    @RequestMapping("/covid")
	public String index(String region) throws Exception {
        System.out.println("region: " + region);
        ICovidService covidService = ServiceFactory.getCovidService();
        CovidResult result = covidService.getCovidResult(region);

        return "Région: " + region + ": Cas: " + result.getNbrInfected() + 
                    " / Mort(s): " + result.getNbrDeath();
	}
}
