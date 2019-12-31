package com.vn.thread;

public class LockClass extends LockBase{

    public void print() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ ": "+ i);
        }
    }

    public void syncBlockPrint() {
        for (int i = 0; i < 10; i++) {
            if(i>4){
               synchronized (this){
                   System.out.println(Thread.currentThread().getName()+ ": "+ i);
               }
            }else {
//                System.out.println(Thread.currentThread().getName()+ ": "+ i);
            }
        }
    }

    public synchronized void syncPrint() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ ": "+ i);
        }
    }

    public static synchronized void staticPrint(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ ": "+ i);
        }
    }
}
