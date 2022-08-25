package com.zzk.lambdademo.demo5.custom;

public class LambdaTest3 {
    public static void main(String[] args) {
        //自定义函数式接口-正常写法
        AnimalDao animalDao1=new AnimalDao() {
            @Override
            public void insert(Animal animal) {
                System.out.println("插入动物1......"+animal);
            }
        };
        animalDao1.insert(new Animal());
        //自定义函数式接口-lambda写法1
        AnimalDao animalDao2=(animal)->{
            System.out.println("插入动物2......"+animal);
        };
        animalDao2.insert(new Animal());
        //自定义函数式接口-lambda写法2
        AnimalDao animalDao3=(animal)-> System.out.println("插入动物3......"+animal);
        animalDao3.insert(new Animal());
    }
}
