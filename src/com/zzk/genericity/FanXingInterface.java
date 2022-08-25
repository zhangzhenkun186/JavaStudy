package com.zzk.genericity;

/**
 * 泛型接口
 * @param <E>
 */
public interface FanXingInterface <E>{
    //泛型方法
    public  E test();
    public  void  test2(E e);

    public <E> void  test3();
}
