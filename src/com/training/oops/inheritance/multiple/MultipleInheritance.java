package com.training.oops.inheritance.multiple;

public class MultipleInheritance { // Java doesn't support multiple inheritance
    // But we can achieve multiple inheritance through interface
    public static void main(String[] args) {
        GrandChild grandChild = new GrandChild();
        grandChild.parentMethod();
        grandChild.childMethod();
    }
}
