package com.zzk.javawhile;

import java.util.Scanner;

/**
 * 斐波那契数列
 * 1 1 2 3 5 8 13 21 34 55 89....
 * 从第3位开始，后面1位是前面两位之和
 * 递归实现
 */
public class FeBoNaQiDemo2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要展示的斐波那契数列个数：");
        long number=scanner.nextLong();
        for(long i=1;i<=number;i++){
            System.out.print(fbnq(i)+"\t");
        }
    }
    public static long  fbnq(long  number){
         if(number==1||number==2){
             return 1L;
         }else {
             return fbnq(number-2)+fbnq(number-1);
         }
    }
}
