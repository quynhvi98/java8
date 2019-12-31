package com.vn.thread;

public class RunableClass implements Runnable {

//    private LockClass lockClass;

    private LockBase keyLock;

    private LockBase instance;

//    RunableClass(LockClass lockClass){
//        this.lockClass = lockClass;
//    }

    RunableClass(LockBase keyLock, LockBase instance){
        this.keyLock = keyLock;
        this.instance = instance;
    }


//    public void run() {
//        if(lockClass == null) return;
//        synchronized (lockClass){
//            lockClass.print();
//        }
//        lockClass.syncPrint();
//        lockClass.staticPrint();
//    }

//    public synchronized void run() {
//        if(lockClass == null) return;
//        lockClass.syncPrint();
//    }

//    public synchronized void run() {
//        for(int i=0; i<10; i++){
//            System.out.println(Thread.currentThread().getName()+ ": "+ i);
//        }
//    }


//    public void run() {
//        System.out.println();
//        synchronized(lockClass){
//            for(int i=0; i<10; i++){
//                System.out.println(Thread.currentThread().getName()+ ": "+ i);
//            }
//        }
//    }

//    public void run() {
//        synchronized(lockClass){
//            new OtherLockClass().print();
//        }
//    }

    public void run() {
//        lockClass.print();
//        lockClass.syncPrint();
        synchronized(keyLock){
            instance.print();
        }
    }
}
