package com.zzk.lambdademo.demo5;

import java.util.function.BiFunction;

/**
 * BiFunction:代表两个输入，一个输出（一般输入和输出类型是不同类型的）
 */
public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<String,String,Integer>  biFunction=(str1,str2)->str1.length()+str2.length();
        System.out.println(biFunction.apply("zzk", "haha"));
    }
}
