package com.blueheart.basethread;


/**
 * 单线程就是进程中只有一个线程。单线程在程序执行时，所走的程序路径按照连续顺序排下来，前面的必须处理好，后面的才会执行
 */

public class SingleThread {

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            System.out.print(i + " ");
        }
    }

}
