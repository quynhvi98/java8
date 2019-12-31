package com.vn.thread;

public class NotifyThread extends Thread {

    private LockClass lockClass;

    NotifyThread(LockClass lockClass){
        this.lockClass = lockClass;
    }

    public void run(){
        synchronized (lockClass){
//            lockClass.notify();
            lockClass.notifyAll();
        }
    }
}
