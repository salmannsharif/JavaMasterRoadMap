package com.training.designpattern;

class A{

    private static A a = null;

    private A(){}

    public synchronized static A getObj(){
        if(a == null){
            a = new A();
            return a;
        }else{
            return a;
        }
    }

}


public class SingleTonExample {
    public static void main(String[] args) {

        // Singleton mean only one object will be created at any time.
        System.out.println(A.getObj());
        System.out.println(A.getObj());

    }
}
