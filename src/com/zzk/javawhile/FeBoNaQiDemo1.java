package com.zzk.javawhile;

import java.util.Scanner;

/**
 * 斐波那契数列
 * 1 1 2 3 5 8 13 21 34 55 89....
 * 从第3位开始，后面1位是前面两位之和
 * for循环实现
 */
public class FeBoNaQiDemo1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要展示的斐波那契数列个数：");
        int number=scanner.nextInt();
        //后面1位是前面两位之和
        int oneNum=1;
        int secondNum=1;
        int thirdNum=0;
        for(int i=1;i<=number;i++){
            //最前面两位是1
            if(i==1||i==2){
                System.out.print(1+"\t");
            }else {
                //从第3位开始，后面1位是前面两位之和
                thirdNum=oneNum+secondNum;
                //计算之后，数字往后移动1位
                oneNum=secondNum;
                secondNum=thirdNum;
                System.out.print(thirdNum+"\t");
            }
        }
    }
}
