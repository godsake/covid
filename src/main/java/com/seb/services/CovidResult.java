package com.seb.services;

public class CovidResult {
    private int nbrInfected=-1;
    private int nbrDeath=-1;

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
