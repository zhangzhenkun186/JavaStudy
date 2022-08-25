package com.zzk.threaddemo.threadpool.workqueue;

import com.zzk.threaddemo.threadpool.Task;

import java.util.concurrent.*;

/**
 * 有界的任务队列
 * 使用ArrayBlockingQueue有界任务队列，
 * ①若有新的任务需要执行时，线程池会创建新的线程，直到创建的线程数量达到corePoolSize时，则会将新的任务加入到等待队列中。
 * ②若等待队列已满，即超过ArrayBlockingQueue初始化的容量，则继续创建线程，直到线程数量达到maximumPoolSize设置的最大线程数量，
 * ③若大于maximumPoolSize，则执行拒绝策略。
 * 在这种情况下，线程数量的上限与有界任务队列的状态有直接关系，如果有界队列初始容量较大或者没有达到超负荷的状态，
 * 线程数将一直维持在corePoolSize以下，反之当任务队列已满时，则会以maximumPoolSize为最大线程数上限。
 */
public class ArrayBlockingQueueDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 15, 3, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        for(int i=0;i<20;i++){
            threadPoolExecutor.execute(new Task());
        }
        threadPoolExecutor.shutdown();
    }
}
