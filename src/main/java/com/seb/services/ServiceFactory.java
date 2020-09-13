package com.seb.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Service
public class ServiceFactory {
    public static ICovidService getCovidService() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
			"META-INF/beans.xml");
		BeanFactory factory = context;
        ICovidService covidService = (ICovidService) 
                                        factory.getBean("covidService");
        return covidService;
    }
}
