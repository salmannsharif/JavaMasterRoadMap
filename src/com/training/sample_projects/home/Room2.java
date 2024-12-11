package com.training.sample_projects.home;

public class Room2 extends Rooms {
    private String homeTheatre;
    private String designLight;

    public String getHomeTheatre() {
        return homeTheatre;
    }

    public void setHomeTheatre(String homeTheatre) {
        this.homeTheatre = homeTheatre;
    }

    public String getDesignLight() {
        return designLight;
    }

    public void setDesignLight(String designLight) {
        this.designLight = designLight;
    }
    public void bed(){
        System.out.println("Bed");
    }
    public void mirror(){
        System.out.println("Mirror");
    }
    public void airConditioner(){
        System.out.println("Air Conditioner");
    }
    public void fan(){
        System.out.println("Fan");
    }
    public void light(){
        System.out.println("Light");
    }

    @Override
    public String toString() {
        return "Room2{" +
                "homeTheatre='" + homeTheatre + '\'' +
                ", designLight='" + designLight + '\'' +
                '}';
    }
}
