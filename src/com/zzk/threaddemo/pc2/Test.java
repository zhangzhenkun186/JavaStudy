package com.zzk.threaddemo.pc2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Test {
    public static void main(String[] args) {
        BlockingDeque<Goods>  blockingDeque= new LinkedBlockingDeque<>(5);
        ProducterQueue producterQueue=new ProducterQueue(blockingDeque);
        ConsumerQueue  consumerQueue=new ConsumerQueue(blockingDeque);
        new Thread(producterQueue).start();
        new Thread(consumerQueue).start();
    }
}
