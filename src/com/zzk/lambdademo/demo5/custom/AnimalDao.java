package com.zzk.lambdademo.demo5.custom;
/**
 * 自定义函数式接口
 * 1.只有一个接口方法
 * 2.FunctionalInterface注解
 */
@FunctionalInterface
public interface AnimalDao {
    public  void  insert(Animal animal);
}
