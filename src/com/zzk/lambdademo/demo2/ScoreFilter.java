package com.zzk.lambdademo.demo2;

import com.zzk.lambdademo.demo1.Student;

public class ScoreFilter implements ObjectFilter<Student>{
    @Override
    public boolean compare(Student student) {
        return student.getScore()>80;
    }
}
