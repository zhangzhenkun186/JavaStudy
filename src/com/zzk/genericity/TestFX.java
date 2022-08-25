package com.zzk.genericity;

import com.zzk.compare.Person;

public class TestFX {
    public static void main(String[] args) {
        FanXing<Integer> fanXing=new FanXing<Integer>();
        fanXing.setId(1);
        fanXing.setA(2);

        FanXing<String> fanXing2=new FanXing<String>();
        fanXing2.setId(2);
        fanXing2.setA("hhh");

        FanXing<Person> fanXing3=new FanXing<Person>();
        fanXing3.setId(3);
        fanXing3.setA(new Person("zhangsan",12));

    }

}
