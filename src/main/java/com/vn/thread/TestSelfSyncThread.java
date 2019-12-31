package com.vn.thread;

public class TestSelfSyncThread {

    public static void main(String[] args){
        Thread t = new SelfSyncThread();
//        ((SelfSyncThread) t).setThread(t);
        t.start();
        Thread t2 = new SelfSyncThread();
//        ((SelfSyncThread) t2).setThread(t);
        t2.start();

    }
}
