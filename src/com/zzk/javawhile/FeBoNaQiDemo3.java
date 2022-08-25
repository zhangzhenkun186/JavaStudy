package com.zzk.javawhile;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 斐波那契数列
 * 1 1 2 3 5 8 13 21 34 55 89....
 * 从第3位开始，后面1位是前面两位之和
 * 数组实现
 */
public class FeBoNaQiDemo3 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要展示的斐波那契数列个数：");
        int number=scanner.nextInt();
        int[] arr=new int[number];
        arr[0]=arr[1]=1;
        for(int i=2;i<arr.length;i++){
             arr[i]=arr[i-2]+arr[i-1];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }

    }
}
