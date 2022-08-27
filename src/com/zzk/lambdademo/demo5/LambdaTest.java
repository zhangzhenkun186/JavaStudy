package com.zzk.lambdademo.demo5;

import java.util.concurrent.Callable;

public class LambdaTest {
    public static void main(String[] args) throws Exception{
        System.out.println("-------------------------①Runnable--------------------------");
        //正常写法
        Runnable runnable1=new Runnable() {
            @Override
            public void run() {
                System.out.println("running1.......");
            }
        };
        runnable1.run();
        //lambda表达式写法
        Runnable runnable2=()->{
            System.out.println("running2.......");
        };
        runnable2.run();
        //lambda表达式写法2
        Runnable runnable3=()-> System.out.println("running3.......");
        runnable3.run();
        System.out.println("-------------------------②Callable--------------------------");
        //正常写法
        Callable<String> callable1=new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "zzk1";
            }
        };
        System.out.println(callable1.call());
        //lambda表达式写法1
        Callable<String>  callable2=()->{return  "zzk2";};
        System.out.println(callable2.call());
        //lambda表达式写法2
        Callable<String> callable3=()->"zzk3";
        System.out.println(callable3.call());


    }
}
