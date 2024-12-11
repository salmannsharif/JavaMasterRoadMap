package com.training.oops.inheritance.multilevel;

public class MultilevelInheritance {
    public static void main(String[] args) {
        GrandChild grandChild = new GrandChild();
        grandChild.parentMethod();
        grandChild.childMethod();
        grandChild.grandChildMethod();
    }
}
