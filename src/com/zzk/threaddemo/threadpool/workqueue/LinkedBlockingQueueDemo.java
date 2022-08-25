package com.zzk.threaddemo.threadpool.workqueue;

import com.zzk.threaddemo.threadpool.Task;

import java.util.concurrent.*;

/**
 * 无界的任务队列。
 * 使用无界任务队列，线程池的任务队列可以无限制的添加新的任务，而线程池创建的最大线程数量就是你corePoolSize设置的数量，
 * 也就是说在这种情况下maximumPoolSize这个参数是无效的，哪怕你的任务队列中缓存了很多未执行的任务，
 * 当线程池的线程数达到corePoolSize后，就不会再增加了；若后续有新的任务加入，则直接进入队列等待，
 * 当使用这种任务队列模式时，一定要注意你任务提交与处理之间的协调与控制，不然会出现队列中的任务由于无法及时处理导致一直增长，直到最后资源耗尽的问题。
 */
public class LinkedBlockingQueueDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 15, 3, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        for(int i=0;i<20;i++){
            threadPoolExecutor.execute(new Task());
        }
        threadPoolExecutor.shutdown();
    }
}
