package com.seb.covid;

import com.seb.services.*;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CovidController {
    @Autowired()
    private ICovidService covidService;

    @RequestMapping("/covid")
	public String index(String region) throws Exception {
        CovidResult result = covidService.getCovidResult(region);

        return region + ": Cas: " + result.getNbrInfected() + 
                    " / Mort(s): " + result.getNbrDeath();
	}
}
