package com.zzk.trycatchfinally;

/**
 * 先执行try中的语句，try中的num计算后先保存起来，先不会返回，先执行finally中语句
 * 如果finally中没有return，会把try中的保存的num返回
 */
public class TryCatchFinallyDemo2 {
    public static void main(String[] args) {

        System.out.println(read());
    }
    public static  int read(){
        int  num=10;
        try {
            System.out.println("try");
            return  num+=10;
        }catch (Exception e){
            System.out.println("catch");
            return num;
        }finally {
            System.out.println("finally");
            num=110;
        }
    }
}
