package com.training.collectionframework.list_interface.vector;

/**
 * The Vector class is a growable and shrinkable collection like ArrayList,
 * but the key difference is that it is synchronized, allowing only one thread to access it at a time.
 * This makes it suitable for multithreaded applications, though performance may be slower due to locking.
 * If thread safety isn’t needed, ArrayList is preferred.
 * Vector extends AbstractList, implements List, and also supports RandomAccess, Cloneable, and Serializable.
 * Vector<Integer> vector = new Vector<>(initialCapacity, capacityIncrement); default capacityIncrement is 10
 * We can set the size of the Vector using the size() method manually don't confuse with capacity.
 * for example:
 * public class MainClass
 *  {
 *     public static void main(String[] args)
 *     {
 *         //Creating Vector with default initial capacity of 10
 *
 *         Vector<Integer> vector = new Vector<Integer>();
 *
 *         //Adding elements to vector
 *
 *         vector.add(10);
 *
 *         vector.add(20);
 *
 *         vector.add(30);
 *
 *         vector.add(40);
 *
 *         //Retrieving the current size of vector
 *
 *         System.out.println(vector.size());      //Output : 4
 *
 *         //Setting the size of vector as 10.
 *
 *         vector.setSize(10);
 *
 *         //Now retrieving the current size of vector
 *
 *         System.out.println(vector.size());    //Output : 10
 *
 *         //Printing the elements of vector. notice that 6 null elements are inserted
 *
 *         System.out.println(vector);     //Output : [10, 20, 30, 40, null, null, null, null, null, null]
 *
 *         //Again changing the size of vector to 3
 *
 *         vector.setSize(3);
 *
 *         //Printing the elements of vector. notice that extra elements are removed.
 *
 *         System.out.println(vector);    //Output : [10, 20, 30]
 *     }
 * }
 *
 * So, We can set the size of the vector unlike ArrayList.
 */
//import java.util.ArrayList; -> Use this class to see the difference between ArrayList and Vector after using Thread
import java.util.Enumeration;
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
        sharedList.add(10);
        sharedList.add(20);
        sharedList.add(30);
        sharedList.add(40);

        System.out.println(sharedList.size());  // 4

        sharedList.setSize(10); // set size to 10

        System.out.println(sharedList.size()); // 10

        System.out.println(sharedList); // [10, 20, 30, 40, null, null, null, null, null, null]

        VectorList thread1 = new VectorList(sharedList, "Thread 1");
        VectorList thread2 = new VectorList(sharedList, "Thread 2");

//        thread1.start();
//        thread2.start();

        /**
         *Vector<Integer> v = new Vector<>(3, 1); (initialCapacity, capacityIncrement)
         * When you give initialCapacity as 3, it means that the initial capacity of the Vector is 3.
         * If you give capacityIncrement as 1, it means that the capacity of the Vector will increase by 1 when the size of the Vector is full.
         *
         * v.add(10); // size = 1, capacity = 3
         * v.add(20); // size = 2, capacity = 3
         * v.add(30); // size = 3, capacity = 3 (full)
         *
         * // Add one more element → capacity increases by +1
         * v.add(40); // size = 4, capacity = 4
         *
         * // Add another element → capacity increases by +1 again
         * v.add(50); // size = 5, capacity = 5
         */


        // Vector class has separate methods for retrieving first and last elements
        System.out.println(sharedList.firstElement()); // 10
        System.out.println(sharedList.lastElement()); // 50


        // Vector has method called elements() that returns Enumeration object which is used to iterate(traverse) over elements
        Enumeration<Integer> elements = sharedList.elements();

        while(elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }

        /**
         * Vector class is often considered as obsolete or “Due for Deprecation” by many experienced Java developers.
         *  They always recommend and advise not to use Vector class in your code.
         *  They prefer using ArrayList over Vector class.
         *  Vector class has only one advantage over ArrayList i.e it is thread safety.
         *  But, you can achieve thread safe ArrayList by using synchronizedList() method of Collections class.
         *  Below is the sample code.
         *
         *        ArrayList<Integer> list = new ArrayList<Integer>();
         *
         *         Collections.synchronizedList(list);
         *
         */





    }
}
