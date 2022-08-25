package com.zzk.threaddemo.pc;

/**
 * 生产者
 */
public class Producter implements Runnable{
    private  Goods goods;

    public Producter(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            if(i % 2==0){
                goods.setGoods("娃哈哈","矿泉水");
            }else{
                goods.setGoods("旺仔","小馒头");
            }
        }
    }
}
