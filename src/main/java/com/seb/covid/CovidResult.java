package com.seb.covid;

public class CovidResult {
    private int nbrInfected=100;
    private int nbrDeath=10;

    public int getNbrInfected() {
        return nbrInfected;
    }

    public int getNbrDeath() {
        return nbrDeath;
    }

    public void setNbrDeath(int nbrDeath) {
        this.nbrDeath = nbrDeath;
    }

    public void setNbrInfected(int nbrInfected) {
        this.nbrInfected = nbrInfected;
    }
}
