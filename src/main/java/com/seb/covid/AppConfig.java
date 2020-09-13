package com.seb.covid;

import com.seb.services.CovidService;
import com.seb.services.ICovidService;
import com.seb.services.IUrlService;
import com.seb.services.UrlService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ICovidService covidService() {
        return (ICovidService) new CovidService();
    }

    @Bean
    public IUrlService urlService() {
        return (IUrlService) new UrlService();
    }
}
