package com.zzk.javawhile;

/**
 * while是先判断，若为真则执行循环，若为假则不循环；
 *
 * do while是无论为真还是假，先执行一遍代码（循环操作），
 * 然后再进行判断是否为真或者是否为假，若为真，则继续执行循环,
 * do while 比while至少无条件多执行一遍代码；
 */
public class WhileDemo {
    public static void main(String[] args) {
        /*int i=1;
        while (i<=100){
            System.out.println("===="+i);
            i++;
            System.out.println("----"+i);
        }*/
        //求100以内偶数的和
        int i=0;
        int sum=0;
        while (i<=100){
            if(i%2==0){
                sum+=i;
            }
            i++;
        }
        System.out.println("100以内偶数的和:"+sum);


    }
}
