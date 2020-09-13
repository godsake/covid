package com.seb.covid;

public class CovidService implements ICovidService {
    public CovidResult getCovidResult(CovidRegionEnum region) {
        return new CovidResult();
    }
}
