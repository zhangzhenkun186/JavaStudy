package com.zzk.compare;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        //外部比较器的用法
        TreeSet  set=new TreeSet(new OutCompare());
        set.add(new Person("zhangsan",18));
        set.add(new Person("lisi",16));
        System.out.println(set);


        //内部部比较器的用法
        TreeSet  set1=new TreeSet();
        set1.add(new Person("zhangsan",18));
        set1.add(new Person("lisi",16));
        System.out.println(set1);
    }
}
