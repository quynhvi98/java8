package com.vn.thread;

public class OtherLockClass extends LockBase {

    public void print() {
//        if(Thread.currentThread().getName().equals("Runable-Thread-DinhDung")){
//            System.out.println("Sleeping 10s");
//            try {
//                Thread.sleep(10000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ ": "+ i);
        }
    }

    public synchronized void syncPrint() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ ": "+ i);
        }
    }
}
