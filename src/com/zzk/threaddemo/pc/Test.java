package com.zzk.threaddemo.pc;

public class Test {
    public static void main(String[] args) {
        Goods goods=new Goods();
        Producter producter=new Producter(goods);
        Consumer  consumer=new Consumer(goods);
        Thread pt=new Thread(producter);
        Thread ct=new Thread(consumer);
        pt.start();
        ct.start();
    }
}
