package com.blueheart.basethread;

public class MultiThread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();    //启动子线程
        //主线程继续同时向下执行
        for (int i = 0; i < 10000; i++) {
            System.out.print(i + " ");
        }
    }
}

/**
 * 继承java.lang.Thread
 */
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.print(i + " ");
        }
    }
}

/**
 * 实现java.lang.Runnable接口
 */
class MyThread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.print(i + " ");
        }
    }
}

