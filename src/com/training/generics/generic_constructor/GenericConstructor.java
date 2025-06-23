package com.training.generics.generic_constructor;

public class GenericConstructor {

    /**
     * In Java Generics, when defining generic methods or constructors,
     * you must declare the type parameter(s) before the return type or constructor name.
     *
     * Syntax Rule:
     * For methods:     <T> ReturnType methodName(T param)
     * For constructors: <T> ClassName(T param)
     *
     * Example:
     * public <T> void printData(T data) { ... }
     * public <T> ClassName(T data) { ... }
     */



    private Object value;

    // Generic constructor
    public <T> GenericConstructor(T data) {
        this.value = data;
        logData(data);
    }

    private <T> void logData(T data) {
        System.out.println("Creating object with value: " + data + " | Type: " + data.getClass().getSimpleName());
    }

    public Object getValue() {
        return value;
    }

    public static void main(String[] args) {
        GenericConstructor name = new GenericConstructor("Salman Sharif");      // String
        GenericConstructor id = new GenericConstructor(1024);                  // Integer
        GenericConstructor salary = new GenericConstructor(87500.50);          // Double
        GenericConstructor activeStatus = new GenericConstructor(true);        // Boolean

        // Later usage
        System.out.println("Stored value (name): " + name.getValue());
    }
}
