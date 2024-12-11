package com.training.sample_projects.home;

public class PoojaRoom {

    private String godStatue;
    private String flowers;
    private String agarBathees;

    public String getGodStatue() {
        return godStatue;
    }

    public void setGodStatue(String godStatue) {
        this.godStatue = godStatue;
    }

    public String getFlowers() {
        return flowers;
    }

    public void setFlowers(String flowers) {
        this.flowers = flowers;
    }

    public String getAgarBathees() {
        return agarBathees;
    }

    public void setAgarBathees(String agarBathees) {
        this.agarBathees = agarBathees;
    }

    @Override
    public String toString() {
        return "PoojaRoom{" +
                "godStatue='" + godStatue + '\'' +
                ", flowers='" + flowers + '\'' +
                ", agarBathees='" + agarBathees + '\'' +
                '}';
    }


}
