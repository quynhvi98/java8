package com.vn.thread;

public class ThreadClass extends Thread {

    private ThreadClass threadClass;

    private LockClass lockClass;

    ThreadClass(LockClass lockClass){
        this.lockClass = lockClass;
    }

    ThreadClass(ThreadClass threadClass){
        this.threadClass = threadClass;
    }

    ThreadClass(){}


    public ThreadClass getThreadClass() {
        return threadClass;
    }

    public void setThreadClass(ThreadClass threadClass) {
        this.threadClass = threadClass;
    }

    @Override
    public void run(){
//        if(lockClass == null) return;
//        lockClass.syncBlockPrint();
        synchronized (threadClass){
            for(int i=0; i<10; i++){
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }

}
