package com.training.oops.inheritance.hierarchical;

public class HierarchicalInheritance {
    public static void main(String[] args) {

        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        GrandChild grandChild = new GrandChild();
        grandChild.grandChildMethod();
        grandChild.parentMethod();

    }
}
