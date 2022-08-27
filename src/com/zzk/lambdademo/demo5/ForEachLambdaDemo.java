package com.zzk.lambdademo.demo5;

import java.util.*;

public class ForEachLambdaDemo {
    public static void main(String[] args) {
        System.out.println("================数组使用lambda表达式================");
        //数组不能使用lambda表达式
        String[] strings=new String[]{"a","b","c","d","e"};
        //错误使用
        //strings.forEach(System.out::println);
        //想要使用，转成流或者转成list
        Arrays.stream(strings).forEach(System.out::print);
        Arrays.asList(strings).forEach(System.out::print);
        System.out.println("\n");
        System.out.println("================List使用lambda表达式================");
        List<String>  list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        //第一种方式
        list.forEach(item->System.out.print(item));
        System.out.println("\n");
        //第二种方式
        list.forEach(System.out::print);
        System.out.println("\n");
        //输出C第一种方法
        list.forEach(item->{
            if("C".equals(item)){
                System.out.println(item);
            }
        });
        //输出C第二种方法:Java8 使用 stream().filter()过滤List对象（查找符合条件的对象集合）
        list.stream().filter(item->item.equals("C")).forEach(System.out::print);
        System.out.println("\n");
        System.out.println("================Map使用lambda表达式================");
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        map.put("E", 50);
        map.put("F", 60);

        map.forEach((k,v)-> System.out.println("key:"+k+"====v:"+v));
        map.forEach((k,v)->{
            if("E".equals(k)){
                System.out.println(v);
            }
        });
    }
}
