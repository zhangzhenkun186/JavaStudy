package com.zzk.threaddemo.pc;

/**
 * 消费者
 */
public class Consumer implements Runnable{
    private  Goods  goods;

    public Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            goods.getGoods();
        }

    }
}
