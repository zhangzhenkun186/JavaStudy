package com.zzk.enumdemo;

public class EnumTest {
    public static void main(String[] args) {
        for(Gender gender:Gender.values()){
            System.out.println(gender.getCode()+"----"+gender.getName());
        }
    }
}
