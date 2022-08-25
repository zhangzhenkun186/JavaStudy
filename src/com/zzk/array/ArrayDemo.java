package com.zzk.array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayDemo {
    public static void main(String[] args) {
        int []  arr=new int[3];
        int []  arr1=new int[]{1,2,3};
        int []  arr2={1,2,3};
        System.out.println(arr1[1]);


        ArrayList  list=new ArrayList();
        list.add(1);
        list.add("zzk");
        list.add(true);

        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        //增强for循环
        for(Object ob:list){
            System.out.println(ob);
        }
    }
}
