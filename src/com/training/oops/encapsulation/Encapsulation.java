package com.training.oops.encapsulation;

public class Encapsulation {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setId(1);
        encapsulation.setName("John Doe");
        encapsulation.setEmail("johndoe@example.com");
        encapsulation.setPhoneNumber("1234567890");

        System.out.println("ID: " + encapsulation.getId());
        System.out.println("Name: " + encapsulation.getName());
        System.out.println("Email: " + encapsulation.getEmail());
        System.out.println("Phone Number: " + encapsulation.getPhoneNumber());
    }
}
