package com.zzk.streamapi.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * 方式一reduce(BinaryOperator accumulator)
 * reduce(BinaryOperator<T> accumulator)方法需要一个函数式接口参数，
 * 该函数式接口需要两个参数，返回一个结果(reduce中返回的结果会作为下次累加器计算的第一个参数)，
 * 也就是累加器,最终得到一个Optional对象
 */
public class ReduceDemo1 {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<Worker>() {
            {
                add(new Worker("Elsdon", 2000, 18));
                add(new Worker("Tamsen", 2371, 55));
                add(new Worker("Floyd", 3322, 25));
                add(new Worker("Sindy", 35020, 15));
            }
        };
        System.out.println("=================计算集合中薪资的和-方式一：使用stream中的reduce================");
        Optional<Integer> reduce1 = workers.stream().map(Worker::getSalary).reduce((x, y) -> x + y);
        int asInt1 = reduce1.get();
        System.out.println(asInt1);
        System.out.println("=================计算集合中薪资的和-方式二：使用IntStream中的reduce================");
        OptionalInt reduce2 = workers.stream().mapToInt(Worker::getSalary).reduce((x, y) -> x + y);
        int asInt2 = reduce2.getAsInt();
        System.out.println(asInt2);
        System.out.println("=================计算集合中薪资的和-方式三：使用Integer中的sum方法================");
        int reduce3 = workers.stream().mapToInt(Worker::getSalary).reduce(0, Integer::sum);
        System.out.println(reduce3);
        System.out.println("=================计算集合中薪资的和-方式四：使用IntStream中的sum方法================");
        int sum = workers.stream().mapToInt(Worker::getSalary).sum();
        System.out.println(sum);



    }
}
