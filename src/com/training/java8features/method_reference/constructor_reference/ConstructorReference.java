package com.training.java8features.method_reference.constructor_reference;

import java.util.Stack;

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

        String data = "Salman";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < data.length(); i++){
            stack.push(data.charAt(i));
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }


    }
}