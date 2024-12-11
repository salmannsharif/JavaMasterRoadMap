package com.training.sample_projects.home;

public class Room1 extends Rooms {
    private String tv;
    private String dvd;
    public String getDvd() {
        return dvd;
    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
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
        return "Room1{" +
                "dvd='" + dvd + '\'' +
                ", tv='" + tv + '\'' +
                '}';
    }
}
