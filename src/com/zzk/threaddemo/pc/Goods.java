package com.zzk.threaddemo.pc;

/**
 * 商品
 */
public class Goods {
    //商标
    private String brand;
    //商品名称
    private String name;
    //flag为false表示没有商品，需要生产
    private boolean flag = false;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //获取商品
    public synchronized void getGoods() {
        //没有商品，等待
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者取走了" + this.getBrand() + "=======" + this.getName());
        flag = false;
        notify();


    }

    //生产商品
    public synchronized void setGoods(String brand, String name) {
        //如果有商品，不生产
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setBrand(brand);
        this.setName(name);
        System.out.println("生产者生产了" + this.getBrand() + "=======" + this.getName());
        flag = true;
        //唤醒消费者
        notify();


    }
}
