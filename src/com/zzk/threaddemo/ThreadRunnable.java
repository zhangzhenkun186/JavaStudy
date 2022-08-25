package com.zzk.threaddemo;


public class ThreadRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"===================="+i);
        }
    }
    public static void main(String[] args) {
        //实现Runnable接口的启动方式
        ThreadRunnable threadDemo2=new ThreadRunnable();
        Thread  thread=new Thread(threadDemo2);
        thread.start();

        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"===================="+i);
        }
    }
}
