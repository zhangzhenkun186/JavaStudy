package com.zzk.lambdademo.demo5;

import java.util.function.Function;

/**
 * Function:代表一个输入，一个输出（一般输入和输出类型是不同类型的）
 */
public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> function1=(str)->{return str.length();};
        System.out.println(function1.apply("ceshi"));
        Function<String,Integer> function2=(String str)->{return str.length();};
        System.out.println(function2.apply("hahahhahaha"));
        Function<String,Integer> function3=(str)->str.length();
        System.out.println(function2.apply("zzk"));
    }
}
