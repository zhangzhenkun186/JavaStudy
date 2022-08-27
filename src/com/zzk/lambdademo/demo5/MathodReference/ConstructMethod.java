package com.zzk.lambdademo.demo5.MathodReference;

import java.util.function.BiFunction;
import java.util.function.Supplier;

/**
 * 构造方法引用
 */
public class ConstructMethod {
    public static void main(String[] args) {
        //无参构造方法引用---第一种方法
        Supplier<Product> supplier1=()->new Product();
        supplier1.get();
        //无参构造方法引用---第二种方法
        Supplier<Product> supplier2=Product::new;
        supplier2.get();

        //有参构造方法引用---第一种方法
        BiFunction<String,Double,Product> biFunction1=(name,price)->new Product(name,price);
        biFunction1.apply("海天酱油",3.5);
        //有参构造方法引用---第二种方法
        BiFunction<String,Double,Product> biFunction2=Product::new;
        biFunction2.apply("七品鲜酱油",2.2);
    }
}
