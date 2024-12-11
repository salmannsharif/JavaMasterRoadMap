package com.training.sample_projects.home;

public class Bathroom1 extends Bathrooms {
    private String washBasin;
    private String westernToilet;

    @Override
    public String toString() {
        return "Bathroom1{" +
                "washBasin='" + washBasin + '\'' +
                ", westernToilet='" + westernToilet + '\'' +
                '}';
    }

    public String getWashBasin() {
        return washBasin;
    }

    public void setWashBasin(String washBasin) {
        this.washBasin = washBasin;
    }

    public String getWesternToilet() {
        return westernToilet;
    }

    public void setWesternToilet(String westernToilet) {
        this.westernToilet = westernToilet;
    }
}
