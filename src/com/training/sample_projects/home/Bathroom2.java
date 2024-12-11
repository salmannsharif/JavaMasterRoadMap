package com.training.sample_projects.home;

public class Bathroom2 extends Bathrooms {
    private String indianToilet;

    public String getIndianToilet() {
        return indianToilet;
    }

    public void setIndianToilet(String indianToilet) {
        this.indianToilet = indianToilet;
    }

    @Override
    public String toString() {
        return "Bathroom2{" +
                "indianToilet='" + indianToilet + '\'' +
                '}';
    }

}
