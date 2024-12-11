package com.training.sample_projects.home;

public class Bathrooms {
    private String soap;
    private String shampoo;
    private String hairConditioner;
    private String shower;
    private String tap;

    @Override
    public String toString() {
        return "Bathrooms{" +
                "soap='" + soap + '\'' +
                ", shampoo='" + shampoo + '\'' +
                ", hairConditioner='" + hairConditioner + '\'' +
                ", shower='" + shower + '\'' +
                ", tap='" + tap + '\'' +
                '}';
    }

    public String getSoap() {
        return soap;
    }

    public void setSoap(String soap) {
        this.soap = soap;
    }

    public String getShampoo() {
        return shampoo;
    }

    public void setShampoo(String shampoo) {
        this.shampoo = shampoo;
    }

    public String getHairConditioner() {
        return hairConditioner;
    }

    public void setHairConditioner(String hairConditioner) {
        this.hairConditioner = hairConditioner;
    }

    public String getShower() {
        return shower;
    }

    public void setShower(String shower) {
        this.shower = shower;
    }

    public String getTap() {
        return tap;
    }

    public void setTap(String tap) {
        this.tap = tap;
    }
}
