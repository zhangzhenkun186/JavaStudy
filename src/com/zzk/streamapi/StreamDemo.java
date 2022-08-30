package com.zzk.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream基础
 */
public class StreamDemo {
    //通过数组来生成
    static void arrayGet() {
        String[] strings = new String[]{"a", "b", "c", "d", "e"};
        Stream<String> stream = Stream.of(strings);
        stream.forEach(System.out::print);

    }

    //通过集合来生成
    static void listGet() {
        List<String> list = Arrays.asList("f", "g", "h", "i", "j");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::print);

    }

    //通过generate方法来生成
    static void generateGet() {
        Stream<Integer> generate = Stream.generate(() -> 1);
        //因为generate()返回无限顺序无序流,不做限制的话，这里会一直输出1，所以这里使用limit()方法做限制
        generate.limit(10).forEach(System.out::print);
    }

    //通过iterate方法来生成
    static void iterateGet() {
        UnaryOperator<Integer> unaryOperator=(x)->x+1;
        Stream<Integer> iterate = Stream.iterate(1, unaryOperator);
        iterate.limit(10).forEach(System.out::println);


    }

    //其他方式生成
    static void otherGet(){
        String  str="abcdef";
        IntStream chars = str.chars();
        chars.forEach(System.out::println);
    }
    //数据流---对象流之间的转化
    static  void  transform(){
        Integer[]  arrBoxed = {1,2,3,4,5,6,7,8,9};
        Stream<Integer> objStream = Arrays.stream(arrBoxed);//返回对象流
        IntStream intStream1 = objStream.mapToInt(e -> e.intValue());//对象流---->数值流
        Stream<Integer> boxed = intStream1.boxed();//数值流---->对象流
    }
    public static void main(String[] args) {
        //arrayGet();
        // listGet();
        //generateGet();
        //iterateGet();
        otherGet();
    }
}
