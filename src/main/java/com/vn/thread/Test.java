package com.vn.thread;

public class Test {

    public static void main(String[] args) {
//        LockClass lockClass = new LockClass();
//        OtherLockClass otherLockClass = new OtherLockClass();
        /// Test Case 1
//        Thread runableThread1 = new Thread(new RunableClass(lockClass), "Runable-Thread-1");
//        Thread runableThread2 = new Thread(new RunableClass(lockClass), "Runable-Thread-2");
//        Thread runableThread3 = new Thread(new RunableClass(lockClass), "Runable-Thread-3");
//        Thread runableThread1 = new Thread(new RunableClass(new LockClass()), "Runable-Thread-1");
//        Thread runableThread2 = new Thread(new RunableClass(new LockClass()), "Runable-Thread-2");
//        runableThread1.start();
//        runableThread1.start();
//        runableThread3.start();
//        runableThread2.start();
//        runableThread1.run();
//        runableThread2.run();


        //// Test Case 2
//        Thread t1 = new ThreadClass(lockClass);
//        Thread t2 = new ThreadClass(lockClass);
//        Thread t3 = new ThreadClass(lockClass);
//        t1.start();
//        t2.start();
//        t3.start();


        /// Test case 3
//        Thread t0 = new ThreadClass();
//        Thread t1 = new ThreadClass();
//        ((ThreadClass) t1).setThreadClass((ThreadClass) t1);
//        Thread t2 = new ThreadClass();
//        ((ThreadClass) t2).setThreadClass((ThreadClass) t2);
//        Thread t3 = new ThreadClass();
//        ((ThreadClass) t3).setThreadClass((ThreadClass) t3);
//        t1.start();
//        t2.start();
//        t3.start();


        /// Test case static
//        Thread st1 = new Thread(new RunableClass(new LockClass()),"Thread_With_static1");
//        Thread st2 = new Thread(new RunableClass(new LockClass()),"Thread_With_static2");
//        Thread st3 = new Thread(new RunableClass(new LockClass()),"Thread_With_static3");
//        st1.start();
//        st2.start();
//        st3.start();

        /// Test case 4
        LockClass butdo = new LockClass();
        OtherLockClass butxanh = new OtherLockClass();
        Thread Dieu = new Thread(new RunableClass(butdo, butxanh), "Runable-Thread-Dieu");
        Thread DinhDung = new Thread(new RunableClass(butdo,butdo), "Runable-Thread-DinhDung");
//        Thread Tuan = new Thread(new RunableClass(new LockClass(),otherLockClass), "Runable-Thread-Tuan");
        Thread Ly = new Thread(new RunableClass(butdo,butxanh), "Runable-Thread-Ly");
        Dieu.start();
        DinhDung.start();
//        Tuan.start();
        Ly.start();
    }
}
