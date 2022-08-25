package com.zzk.threaddemo;

/**
 * 线程模拟卖票
 */
public class TicketThreadDemo2 implements Runnable {
    private static int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.sale();
        }
    }

    public synchronized void sale() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "正在买第" + (ticket--) + "张票");
        }


    }

    public static void main(String[] args) {
        TicketThreadDemo2 ticketThreadDemo = new TicketThreadDemo2();
        Thread thread1 = new Thread(ticketThreadDemo, "A");
        Thread thread2 = new Thread(ticketThreadDemo, "B");
        Thread thread3 = new Thread(ticketThreadDemo, "C");
        Thread thread4 = new Thread(ticketThreadDemo, "D");
        Thread thread5 = new Thread(ticketThreadDemo, "E");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
