package com.zzk.lambdademo.demo5.MathodReference;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 静态方法引用
 */
public class StaticMathod {
    public static void main(String[] args) {
        //第一种静态方法引用方式
        Supplier<Integer> s1=()->Product.init();
        System.out.println(s1.get());
        //第二种静态方法引用方式
        Supplier<Integer> s2=Product::init;
        System.out.println(s2.get());
        //有入参出参的方法调用-第一种
        Function<String,String> function1=(str)->Product.getName(str);
        System.out.println(function1.apply("旺仔牛奶"));
        //有入参出参的方法引用-第二种
        Function<String,String> function2=Product::getName;
        System.out.println(function2.apply("QQ糖"));

    }
}
