package com.training.java8features.method_reference.constructor_reference;

interface Messageable{
    void getMessage(String message);
}

class Message{
    Message(String message){
        System.out.println(message);
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        Messageable messageable = Message::new;
        messageable.getMessage("Hi there!"); // Output: Hello, Java 8!
    }
}
