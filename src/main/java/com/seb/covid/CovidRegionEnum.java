package com.seb.covid;

public enum CovidRegionEnum {
    CapitaleNationale("Capitale-Nationale"), 
    BasSaintLaurent("Bas-Saint-Laurent");

    // Saguenay-Lac-Saint-Jean, Mauricie-et-Centre-du-Québec, Estrie, Montréal, 
    // Outaouais, Abitibi-Témiscamingue, Côte-Nord, Nord-du-Québec, 
    // Gaspésie-Îles-de-la-Madeleine, Chaudière-Appalaches, Laval,
    // Lanaudière, Laurentides, Montérégie

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
