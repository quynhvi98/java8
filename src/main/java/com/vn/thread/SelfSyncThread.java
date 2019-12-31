package com.vn.thread;

public class SelfSyncThread extends Thread {

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    private Thread thread;

    SelfSyncThread() {
    }


    public void run() {
        synchronized (thread) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}
