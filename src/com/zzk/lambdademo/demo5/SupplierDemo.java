package com.zzk.lambdademo.demo5;

import java.util.function.Supplier;

/**
 * Supplier:代表一个输出
 */
public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String>  s1=()->{return "zzk";};
        System.out.println(s1.get());
        Supplier<String>  s2=()->"haha";
        System.out.println(s2.get());
    }
}
