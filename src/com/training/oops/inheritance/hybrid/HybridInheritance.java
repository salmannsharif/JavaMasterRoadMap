package com.training.oops.inheritance.hybrid;

import com.training.oops.inheritance.multilevel.GrandChild;

public class HybridInheritance {
    public static void main(String[] args) {
        GrandChild grandChild = new GrandChild();
        grandChild.parentMethod();
        grandChild.childMethod();
        grandChild.grandChildMethod();
    }
}
