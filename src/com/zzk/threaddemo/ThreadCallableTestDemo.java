package com.zzk.threaddemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCallableTestDemo {
    public static void main(String[] args) {
        ThreadCallableDemo threadCallableDemo = new ThreadCallableDemo("thread1");
        FutureTask<String> stringFutureTask = new FutureTask<String>(threadCallableDemo);
        Thread thread=new Thread(stringFutureTask);
        thread.start();
        try {
            String  threadName=stringFutureTask.get();
            System.out.println(threadName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
