package com.training.sample_projects.home;

public class Rooms {
    private String bed;
    private String mirror;
    private String airConditioner;
    private String fan;
    private String light;

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getMirror() {
        return mirror;
    }

    public void setMirror(String mirror) {
        this.mirror = mirror;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(String airConditioner) {
        this.airConditioner = airConditioner;
    }

    public String getFan() {
        return fan;
    }

    public void setFan(String fan) {
        this.fan = fan;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    @Override
    public String toString() {
        return "Rooms{" +
                "bed='" + bed + '\'' +
                ", mirror='" + mirror + '\'' +
                ", airConditioner='" + airConditioner + '\'' +
                ", fan='" + fan + '\'' +
                ", light='" + light + '\'' +
                '}';
    }
}
