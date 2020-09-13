package com.seb.covid;

import com.seb.services.CovidService;
import com.seb.services.ICovidService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ICovidService covidService() {
        return (ICovidService) new CovidService();
    }
}
