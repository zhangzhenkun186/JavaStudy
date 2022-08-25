package com.zzk.innerclass;

public class InnerClassDemoTest {
    public static void main(String[] args) {
        InnerClassDemo innerClassDemo=new InnerClassDemo();
        innerClassDemo.show();
        //new 内部类对象
        InnerClassDemo.InnerClass  innerClass=new InnerClassDemo().new InnerClass();
        innerClass.test();
        //静态内部类引用
        InnerClassDemo.StaticInnerClass staticInnerClass=new InnerClassDemo.StaticInnerClass();
    }
}
