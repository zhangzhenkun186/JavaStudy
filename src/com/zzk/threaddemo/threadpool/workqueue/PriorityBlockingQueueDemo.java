package com.zzk.threaddemo.threadpool.workqueue;

import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 优先级队列
 * 除了第一个任务直接创建线程执行外，其他的任务都被放入了优先任务队列，按优先级进行了重新排列执行，且线程池的线程数一直为corePoolSize，也就是只有一个。
 *
 * 通过运行的代码我们可以看出PriorityBlockingQueue它其实是一个特殊的无界队列，它其中无论添加了多少个任务，
 * 线程池创建的线程数也不会超过corePoolSize的数量，只不过其他队列一般是按照先进先出的规则处理任务，
 * 而PriorityBlockingQueue队列可以自定义规则根据任务的优先级顺序先后执行。
 */
public class PriorityBlockingQueueDemo {
    public static void main(String[] args) {
        //优先任务队列
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 1000, TimeUnit.MILLISECONDS, new PriorityBlockingQueue<Runnable>(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        for(int i=0;i<20;i++) {
            threadPoolExecutor.execute(new ThreadTask(i));
        }
    }
}
