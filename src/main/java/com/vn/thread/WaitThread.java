package com.vn.thread;

public class WaitThread extends Thread {

    private LockClass lockClass;

    WaitThread(LockClass lockClass){
        this.lockClass = lockClass;
    }

    @Override
    public void run(){
        synchronized (lockClass){
            try {
                lockClass.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+ ": "+ i);
            }
        }
    }
}
