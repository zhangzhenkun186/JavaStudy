package com.zzk.threaddemo.threadpool.workqueue;

import com.zzk.threaddemo.threadpool.Task;

import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 直接提交队列：设置为SynchronousQueue队列，SynchronousQueue是一个特殊的BlockingQueue，它没有容量，
 * 每执行一个插入操作就会阻塞，需要再执行一个删除操作才会被唤醒，反之每一个删除操作也都要等待对应的插入操作
 *
 *
 * 当任务队列为SynchronousQueue，创建的线程数大于maximumPoolSize时，直接执行了拒绝策略抛出异常。
 *
 * 使用SynchronousQueue队列，提交的任务不会被保存，总是会马上提交执行。
 * 如果用于执行任务的线程数量小于maximumPoolSize，则尝试创建新的进程，
 * 如果达到maximumPoolSize设置的最大值，则根据你设置的handler执行拒绝策略。
 * 因此这种方式你提交的任务不会被缓存起来，而是会被马上执行，
 * 在这种情况下，你需要对你程序的并发量有个准确的评估，才能设置合适的maximumPoolSize数量，否则很容易就会执行拒绝策略；
 */
public class SynchronousQueueDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 3, TimeUnit.MILLISECONDS, new SynchronousQueue<Runnable>(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        for(int i=0;i<3;i++){
            threadPoolExecutor.execute(new Task());
        }
        threadPoolExecutor.shutdown();
    }
}
