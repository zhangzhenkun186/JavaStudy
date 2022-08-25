package com.zzk.threaddemo;

import java.util.concurrent.Callable;

public class ThreadCallableDemo implements Callable {
    private String  threadName;

    public ThreadCallableDemo(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public Object call() throws Exception {

        return threadName;
    }
}
