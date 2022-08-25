package com.zzk.threaddemo;

/**
 * 两个线程交替打印
 */
public class AlternateDemo implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"================="+i);
            try {
                Thread.sleep(1001);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        AlternateDemo  alternateDemo=new AlternateDemo();
        Thread  thread=new Thread(alternateDemo);
        thread.start();

        for(int i=10;i>0;i--){
            System.out.println(Thread.currentThread().getName()+"================="+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
