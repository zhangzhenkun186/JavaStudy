package com.zzk.threaddemo;

public class ThreadDemo extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"===================="+i);
        }
    }

    public static void main(String[] args) {
        //继承Thread类的启动方式
        ThreadDemo  threadDemo=new ThreadDemo();
        threadDemo.start();

        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"===================="+i);
        }
    }
}
