package com.zzk.lambdademo.demo5.MathodReference;

import java.util.function.BiFunction;

/**
 * 实例方法引用
 */
public class InstanceMethod {
    public static void main(String[] args) {
        //实例方法引用--第一种方式
        BiFunction<Double,Integer,Double> biFunction1=(price,num)->new Product().getCount(price,num);
        System.out.println(biFunction1.apply(4.50, 8));
        //实例方法引用--第二种方式
        BiFunction<Double,Integer,Double> biFunction2=new Product()::getCount;
        System.out.println(biFunction1.apply(2.50, 9));
    }
}
