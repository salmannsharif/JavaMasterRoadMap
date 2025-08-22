package com.training.collectionframework.list_interface.vector;

/**
 * The Vector class is a growable and shrinkable collection like ArrayList,
 * but the key difference is that it is synchronized, allowing only one thread to access it at a time.
 * This makes it suitable for multithreaded applications, though performance may be slower due to locking.
 * If thread safety isn’t needed, ArrayList is preferred.
 * Vector extends AbstractList, implements List, and also supports RandomAccess, Cloneable, and Serializable.
 */
//import java.util.ArrayList; -> Use this class to see the difference between ArrayList and Vector after using Thread
import java.util.Vector;

public class VectorList extends Thread{

    Vector<Integer> vector;
    String threadName;

    VectorList(Vector<Integer> vector, String threadName) {
        this.vector = vector;
        this.threadName = threadName;
    }

    public void run() {
        for(int i=1; i<=5; i++) {

            vector.add(i);
            System.out.println(threadName + " added " + i + " -> " + vector);
            try {
                Thread.sleep(100); // small delay so we can see step by step
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {

        Vector<Integer> sharedList = new Vector<>();

        VectorList thread1 = new VectorList(sharedList, "Thread 1");
        VectorList thread2 = new VectorList(sharedList, "Thread 2");

        thread1.start();
        thread2.start();

    }
}
