package com.blueheart.basethread;

public class ThreadSleep {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(1000);    //当前main线程暂停1000ms
            } catch (InterruptedException e) {
            }
        }
    }

}
