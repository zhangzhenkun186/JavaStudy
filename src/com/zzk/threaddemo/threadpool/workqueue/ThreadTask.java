package com.zzk.threaddemo.threadpool.workqueue;

public class ThreadTask implements Runnable,Comparable<ThreadTask>{

    private int priority;

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public ThreadTask() {

    }

    public ThreadTask(int priority) {
        this.priority = priority;
    }

    @Override
    public void run() {
        //让线程阻塞，使后续任务进入缓存队列
        try {
            Thread.sleep(1000);
            System.out.println("priority:"+this.priority+",ThreadName:"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int compareTo(ThreadTask o) {
        //当前对象和其他对象做比较，当前优先级大就返回-1，优先级小就返回1,值越小优先级越高
        return this.priority>o.priority?-1:1;
    }
}
