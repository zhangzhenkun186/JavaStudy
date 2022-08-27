package com.zzk.lambdademo.demo5;

import java.util.function.Consumer;

/**
 * Consumer代表一个输入
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String>  c1=(String str)-> {System.out.println(str);};
        c1.accept("zzk");
        Consumer<String>  c2=(str)-> {System.out.println(str);};
        c2.accept("haha");
        Consumer<String>  c3=(str)-> System.out.println(str);
        c3.accept("ceshi");
    }
}
