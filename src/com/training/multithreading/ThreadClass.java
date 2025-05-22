package com.training.multithreading;

/**
 * Thread :
 * Thread is lightweight process and unit of execution within a program, It represents the independent
    path of execution in a program. In java, every program has at least has one thread: the main thread, which
    execute the main() method.*/

    /**Threads enable concurrency, allowing multiple tasks to be performed simultaneously,
    improving performance and responsiveness.
     1.Performance: Utilize multiple CPU cores to execute tasks in parallel (e.g., processing large datasets).
     2.Responsiveness: Keep applications responsive (e.g., a GUI remains interactive while a background task runs).
     3.Resource Sharing: Threads share the same memory space, making communication between them efficient.
     4.Scalability: Multithreading is essential for server applications (e.g., handling multiple client requests concurrently).
     */

    /**Multiple Thread:
    Multithreading is the process of executing multiple threads simultaneously.
    Essentially, multithreading allows a program to do several tasks at the same time by dividing
    the work into separate threads, which can then run concurrently.*/

    /**
     1. Web Servers: Handle multiple client requests concurrently (e.g., Apache Tomcat uses a thread pool).
    2. GUI Applications: Keep the user interface responsive while performing background tasks (e.g., Swing applications).
    3. Parallel Processing: Speed up computations (e.g., image processing, data analysis).
    4. Asynchronous Tasks: Perform I/O operations (e.g., downloading files) without blocking the main thread.
    5. Real-time Systems: Handle multiple events simultaneously (e.g., gaming, simulations).*/

/**A thread can be in one of these states:
    1. New: Thread created but not started.
    2. Runnable: Thread is ready to run or running.
    3. Blocked: Waiting for a monitor lock (e.g., in a synchronized block).
    4. Waiting: Waiting for another thread to perform an action (e.g., wait()).
    5. Timed Waiting: Waiting for a specified time (e.g., sleep() or join(timeout)).
    6. Terminated: Thread has completed execution.*/

    class A1 extends Thread  {
    public void run(){
        for(int i=0;i<50; i++) {
            System.out.println("Hello....");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B1 extends Thread{
    public void run(){
        for(int i=0; i<50; i++) {
            System.out.println("Bye....");
        }
    }
}

public class ThreadClass {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(0);
//        CompletableFuture.supplyAsync(() -> {
//                    try { Thread.sleep(1000); } catch (Exception e) {}
//                    return "Hello";
//                }).thenApply(s -> s + ", World!")
//                .thenAccept(System.out::println);
        A1 a = new A1();
        B1 b = new B1();
        a.start();
        b.start();

    }
}