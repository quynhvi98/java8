package com.vn.thread;

public class TestJoinThread {

    public static void main(String[] args) throws InterruptedException {
//        Thread wt1 = new JoinThread(Thread.currentThread());
        Thread wt1 = new JoinThread("JoinThread_1");
        Thread wt2 = new JoinThread("JoinThread_2");
        Thread wt3 = new JoinThread("JoinThread_3");

        wt1.start();

//        wt1.join();

//        System.out.println("Current Thread name is: "+ Thread.currentThread().getName()+ " has state is : "+Thread.currentThread().getState().name());
        wt2.start();
//        try {
//            wt2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        wt3.start();
//        try {
//            wt3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("main thread");

        //// Test Case 2
//        wt1.start();
//        wt2.start();
//        wt3.start();


    }
}
