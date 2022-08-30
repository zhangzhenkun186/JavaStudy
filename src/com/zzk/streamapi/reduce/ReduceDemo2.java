package com.zzk.streamapi.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * 方式二reduce(T identity, BinaryOperator accumulator)
 * T identity：初始值
 * reduce(BinaryOperator<T> accumulator)方法需要一个函数式接口参数，
 * 该函数式接口需要两个参数，返回一个结果(reduce中返回的结果会作为下次累加器计算的第一个参数)，
 * 也就是累加器,最终得到一个Optional对象
 */
public class ReduceDemo2 {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<Worker>() {
            {
                add(new Worker("Elsdon", 2000, 18));
                add(new Worker("Tamsen", 2371, 55));
                add(new Worker("Floyd", 3322, 25));
                add(new Worker("Sindy", 35020, 15));
            }
        };
        System.out.println("=================计算集合中薪资的和：使用stream中的reduce(T identity, BinaryOperator accumulator)================");
        Integer reduce = workers.stream().map(Worker::getSalary).reduce(10000, (x, y) -> x + y);
        System.out.println(reduce);


    }
}
