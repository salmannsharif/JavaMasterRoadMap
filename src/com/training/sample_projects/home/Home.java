package com.training.sample_projects.home;

public class Home {
    private Room1 room1;
    private Room2 room2;
    private Bathroom1 bathroom1;
    private Bathroom2 bathroom2;
    private Kitchen kitchen;
    private PoojaRoom poojaRoom;
    private StorageRoom storageRoom;

    public Room1 getRoom1() {
        return room1;
    }

    public void setRoom1(Room1 room1) {
        this.room1 = room1;
    }

    public Room2 getRoom2() {
        return room2;
    }

    public void setRoom2(Room2 room2) {
        this.room2 = room2;
    }

    public Bathroom1 getBathroom1() {
        return bathroom1;
    }

    public void setBathroom1(Bathroom1 bathroom1) {
        this.bathroom1 = bathroom1;
    }

    public Bathroom2 getBathroom2() {
        return bathroom2;
    }

    public void setBathroom2(Bathroom2 bathroom2) {
        this.bathroom2 = bathroom2;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public PoojaRoom getPoojaRoom() {
        return poojaRoom;
    }

    public void setPoojaRoom(PoojaRoom poojaRoom) {
        this.poojaRoom = poojaRoom;
    }

    public StorageRoom getStorageRoom() {
        return storageRoom;
    }

    public void setStorageRoom(StorageRoom storageRoom) {
        this.storageRoom = storageRoom;
    }
    @Override
    public String toString() {
        return "Home{" +
                "room1=" + room1 +
                ", room2=" + room2 +
                ", bathroom1=" + bathroom1 +
                ", bathroom2=" + bathroom2 +
                ", kitchen=" + kitchen +
                ", poojaRoom=" + poojaRoom +
                ", storageRoom=" + storageRoom +
                '}';
    }

}
