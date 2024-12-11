package com.training.sample_projects.home;
public class Kitchen {
    private String stove;
    private String refrigerator;
    private String microwave;
    private String cooker;
    private String riceBag;

    public String getStove() {
        return stove;
    }

    public void setStove(String stove) {
        this.stove = stove;
    }

    public String getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(String refrigerator) {
        this.refrigerator = refrigerator;
    }

    public String getMicrowave() {
        return microwave;
    }

    public void setMicrowave(String microwave) {
        this.microwave = microwave;
    }

    public String getCooker() {
        return cooker;
    }

    public void setCooker(String cooker) {
        this.cooker = cooker;
    }

    public String getRiceBag() {
        return riceBag;
    }

    public void setRiceBag(String riceBag) {
        this.riceBag = riceBag;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "stove='" + stove + '\'' +
                ", refrigerator='" + refrigerator + '\'' +
                ", microwave='" + microwave + '\'' +
                ", cooker='" + cooker + '\'' +
                ", riceBag='" + riceBag + '\'' +
                '}';
    }
}
