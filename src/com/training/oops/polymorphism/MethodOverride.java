package com.training.oops.polymorphism;

class Payment {
    public void processPayment(double amount) {
        System.out.println("Processing generic payment of ₹" + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount + " with a 2% fee.");
    }
}

class PayPalPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of ₹" + amount + " with an email notification.");
    }
}

class UPIPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount + " directly from the bank account.");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        // Parent class reference for each payment type
        Payment creditCard = new CreditCardPayment();
        Payment paypal = new PayPalPayment();
        Payment upi = new UPIPayment();

        // Process payments
        creditCard.processPayment(5000); // Calls the CreditCardPayment method
        paypal.processPayment(3000);     // Calls the PayPalPayment method
        upi.processPayment(2000);        // Calls the UPIPayment method
    }
}
