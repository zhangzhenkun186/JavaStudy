package com.zzk.equalsdeno;

public class EqualsDemo {
    public static void main(String[] args) {

        Student stu1=new Student(18,"张三");
        Student stu2=stu1;
        stu2.setName("李四");
        stu1.setName("王五");
        System.out.println(stu2==stu1);
        System.out.println(stu2.equals(stu1));
    }
}
