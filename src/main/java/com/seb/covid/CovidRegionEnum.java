package com.seb.covid;

public enum CovidRegionEnum {
    CapitaleNationale("Capitale-Nationale"), 
    BasSaintLaurent("Bas-Saint-Laurent");

    private String value;

    CovidRegionEnum(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.getValue();
    }
}
