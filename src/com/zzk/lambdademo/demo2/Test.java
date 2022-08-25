package com.zzk.lambdademo.demo2;

import com.zzk.lambdademo.demo1.Student;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<Student>();
        students.add(new Student("zhangsan",12,89));
        students.add(new Student("lisi",13,67));
        students.add(new Student("wangwu",15,79));
        students.add(new Student("zhangliu",16,75));
        students.add(new Student("sunqi",11,97));
        getByFilter(students,new AgeFilter());
        getByFilter(students,new ScoreFilter());
    }
    public static void getByFilter(List<Student> students,ObjectFilter<Student> objectFilter){
        List<Student> list=new ArrayList<Student>();
        for (Student student:students){
            if(objectFilter.compare(student)){
                list.add(student);
            }
        }
        printlnStudent(list);
    }
    public  static void printlnStudent(List<Student> students){
        for(Student student:students){
            System.out.println(student);
        }
    }
}
