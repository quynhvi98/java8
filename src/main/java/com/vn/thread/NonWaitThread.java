package com.vn.thread;

public class NonWaitThread extends Thread{

    private LockClass lockClass;

    NonWaitThread(LockClass lockClass){
        this.lockClass = lockClass;
    }

    @Override
    public void run(){
        synchronized (lockClass){
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+ ": "+ i);
            }
        }
    }
}
