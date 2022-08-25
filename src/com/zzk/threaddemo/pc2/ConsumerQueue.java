package com.zzk.threaddemo.pc2;

import java.util.concurrent.BlockingDeque;

public class ConsumerQueue implements Runnable{
    BlockingDeque<Goods>  blockingDeque;

    public ConsumerQueue(BlockingDeque<Goods> blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            try {
                Goods goods=blockingDeque.take();
                System.out.println("消费者取出了"+goods.getBrand()+"======"+goods.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
