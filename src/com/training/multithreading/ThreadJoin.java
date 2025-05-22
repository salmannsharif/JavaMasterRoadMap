package com.training.multithreading;

// Thread join is used to make the main thread wait until the other thread has finished

class A extends Thread{
    int j = 0;
    public void run(){
        for(int i=0; i<50; i++){
            j = i;
        }
    }
}

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        A obj = new A();
        obj.start();
        obj.join();
        System.out.println(obj.j);
    }
}
