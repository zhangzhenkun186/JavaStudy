package com.zzk.genericity;

/**
 * 泛型类
 * @param <A>
 */
public class FanXing<A>{
    private int id;
    private A  a;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}
