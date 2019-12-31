package com.vn.thread;

public class JoinThread extends Thread{

    private String name;

    private Thread thread;

    JoinThread(){

    }

    JoinThread(String name){
//        Thread.currentThread().setName(name);
        this.name = name;
    }

    JoinThread(Thread thread){
        this.thread = thread;
    }

    @Override
    public void run(){
        if(thread != null) {
            System.out.println("Current Thread name is: "+ Thread.currentThread().getName()+ " has state is : "+Thread.currentThread().getState().name());
            System.out.println(thread.getName() +" thread state is " + thread.getState().name());
        }
        if(name != null) {
            Thread.currentThread().setName(name);
        }
        try {
            this.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

}
