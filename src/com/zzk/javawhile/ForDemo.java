package com.zzk.javawhile;

import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
        /*int a=1;
        for(int i=1;i<=1000;i++){
            if(i%5==0){
                System.out.print(i+"---");
                a++;
                if(a%3==1){
                    System.out.println();
                }
            }
        }*/
        /*int sum=0;
        for(int i=1;i<=10;i++){
            int count=1;
            for(int j=1;j<=i;j++){
                count*=j;
            }
            sum+=count;
        }
        System.out.println(sum);*/
        //十进制转换成二进制
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个十进制数：");
        int number=sc.nextInt();
        String str="";
        while(number!=0){
            int i=number%2;
            str=i+str;
            number=number/2;
        }
        System.out.println(str);
    }
}
