package com.zzk.threaddemo.pc2;

import java.util.concurrent.BlockingDeque;

public class ProducterQueue implements Runnable {
    private BlockingDeque<Goods> blockingDeque;

    public ProducterQueue(BlockingDeque<Goods> blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Goods goods = null;
            if (i % 2 == 0) {
                goods = new Goods("娃哈哈", "矿泉水");
            } else {
                goods = new Goods("旺仔", "小馒头");
            }
            try {
                System.out.println("生产者生产了"+goods.getBrand()+"===="+goods.getName());
                blockingDeque.put(goods);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
