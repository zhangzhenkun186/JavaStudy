package com.zzk.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 进阶应用
 */
public class StreamApply {
    //Stream方法应用
    static void  methedApplyDemo(){
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        //x->x%2==0和(x)->x%2==0写法一样
        //输出集合中的偶数
        list.stream().filter(x->x%2==0).forEach(System.out::println);
        //求偶数的和--sum方法是IntStream中的方法，所以这里需要使用mapToInt()把Stream转成IntStream
        int sum = list.stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
        System.out.println(sum);
        //返回集合中的最大值
        Optional<Integer> max = list.stream().max((a,b)->a-b);
        System.out.println(max.get());
        //返回集合中的最小值
        Optional<Integer> min = list.stream().min((a,b)->a-b);
        System.out.println(min.get());

        Optional<Integer> first = list.stream().filter(x -> x % 2 == 0).findFirst();
        System.out.println(first.get());
        Optional<Integer> find = list.stream().filter(x -> x % 2 == 0).findAny();
        System.out.println(find.get());
        //获取最大值和最小值，不使用max和min方法
        Optional<Integer> min1 = list.stream().sorted().findFirst();
        System.out.println(min1.get());
        Optional<Integer> max2 = list.stream().sorted((a, b) -> b - a).findFirst();
        System.out.println(max2.get());
        //过滤之后，返回一个集合
        System.out.println("=============================");
        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        collect.forEach(System.out::println);
        //去重
        System.out.println("===============去重==============");
        Arrays.asList(1,2,2,3,4,5,5,6,7,8,8,8).stream().distinct().forEach(System.out::print);
        System.out.println("\n===============去重==============");
        Arrays.asList(1,2,2,3,4,5,5,6,7,8,8,8).stream().collect(Collectors.toSet()).forEach(System.out::print);

        //输出21-30的数据集合
        System.out.println("\n===============输出21-30的数据集合==============");
        Stream.iterate(1,x->x+1).limit(50).skip(20).limit(10).forEach(System.out::println);
        System.out.println("\n===============字符串中的数字求和==============");
        String str="11,22,33,44";
        System.out.println(Stream.of(str.split(",")).mapToInt(x -> Integer.valueOf(x)).sum());
        System.out.println(Stream.of(str.split(",")).mapToInt(Integer::valueOf).sum());
        System.out.println(Stream.of(str.split(",")).map(x -> Integer.valueOf(x)).mapToInt(x -> x).sum());
        System.out.println(Stream.of(str.split(",")).map(Integer::valueOf).mapToInt(x -> x).sum());
        System.out.println("===============创建一组自定义对象数组==============");
        String str2="java,C++,Scala,C#";
        Stream.of(str2.split(",")).map(name->new Person(name)).forEach(System.out::println);
        Stream.of(str2.split(",")).map(Person::new).forEach(System.out::println);
        Stream.of(str2.split(",")).map(name->Person.build(name)).forEach(System.out::println);
        Stream.of(str2.split(",")).map(Person::build).forEach(System.out::println);

        //集合中的数据是否都符合
        System.out.println(list.stream().allMatch(x -> x % 2 == 0));
        //集合中数据有符合的
        System.out.println(list.stream().anyMatch(x -> x % 2 == 0));
        System.out.println(list.stream().noneMatch(x -> x % 2 == 0));

    }
    public static void main(String[] args) {
        methedApplyDemo();
    }
}
