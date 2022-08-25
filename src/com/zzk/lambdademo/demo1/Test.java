package com.zzk.lambdademo.demo1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student>  students=new ArrayList<Student>();
        students.add(new Student("zhangsan",12,89));
        students.add(new Student("lisi",13,67));
        students.add(new Student("wangwu",15,79));
        students.add(new Student("zhangliu",16,75));
        students.add(new Student("sunqi",11,97));
        getAage(students);
        getScore(students);

    }
    public static void getAage(List<Student> students){
      List<Student> list=new ArrayList<Student>();
        for(Student student:students){
            if(student.getAge()>14){
                list.add(student);
            }
        }
        for (Student student:list){
            System.out.println(student);
        }
    }
    public static void getScore(List<Student> students){
        List<Student> list=new ArrayList<Student>();
        for(Student student:students){
            if(student.getScore()>80){
                list.add(student);
            }
        }
        for (Student student:list){
            System.out.println(student);
        }
    }

}
