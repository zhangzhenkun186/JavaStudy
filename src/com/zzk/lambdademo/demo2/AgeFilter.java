package com.zzk.lambdademo.demo2;

import com.zzk.lambdademo.demo1.Student;

public class AgeFilter implements ObjectFilter<Student>{
    @Override
    public boolean compare(Student student) {
        return student.getAge()>14;
    }
}
