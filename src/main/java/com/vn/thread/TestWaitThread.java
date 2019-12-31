package com.vn.thread;

public class TestWaitThread {
    public static void main(String[] args){
        LockClass lockClass = new LockClass();
        Thread wt1 = new WaitThread(lockClass);
        wt1.start();
        Thread wt12 = new WaitThread(lockClass);
        wt12.start();
//        Thread wt2 = new NonWaitThread(lockClass);
//        wt2.start();
//        try {
//            synchronized (lockClass){
//                lockClass.wait();
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("main thread");
//

//        while (true){
//            if(!wt2.isAlive()){
//                synchronized (wt2){
//                    wt2.notify();
//                }
//                break;
//            }
//        }
        Thread wt3 = new NotifyThread(lockClass);
        wt3.start();
    }
}
