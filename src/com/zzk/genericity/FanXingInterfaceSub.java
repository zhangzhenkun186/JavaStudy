package com.zzk.genericity;

/**
 * 泛型接口第一种使用形式
 */
public class FanXingInterfaceSub implements FanXingInterface<String>{
    @Override
    public String test() {
        return "test";
    }

    @Override
    public void test2(String s) {
        System.out.println(s);
    }

    @Override
    public <E> void test3() {

    }


}
