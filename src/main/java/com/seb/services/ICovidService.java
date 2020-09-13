package com.seb.services;

public interface ICovidService {
    public CovidResult getCovidResult(String region) throws Exception;
}
