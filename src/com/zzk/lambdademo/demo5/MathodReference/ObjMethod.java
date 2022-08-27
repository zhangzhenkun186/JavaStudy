package com.zzk.lambdademo.demo5.MathodReference;


import java.util.function.BiFunction;


/**
 * 对象方法引用
 * ①抽象方法的第一个参数，必须是实例方法调用者的类型；
 * ②抽象方法的剩余参数，是实例方法的入参;
 */
public class ObjMethod {
    public static void main(String[] args) {
        //第一种对象方法引用
        BiFunction<Product,String,String> biFunction1=(e,name)->new Product().getName2(name);
        System.out.println(biFunction1.apply(new Product(),"海天酱油"));
        //第二种对象方法引用
        BiFunction<Product,String,String> biFunction2=Product::getName2;
        System.out.println(biFunction2.apply(new Product(), "七品鲜酱油"));
    }
}
