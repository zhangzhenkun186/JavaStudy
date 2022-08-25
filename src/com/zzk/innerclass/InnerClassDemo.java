package com.zzk.innerclass;

public class InnerClassDemo {
    private  int  num;
    private  String name;
    private  String realname="王五";
    public  void  show(){
        System.out.println("show");
        new InnerClass().test();
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //内部类
    class  InnerClass{
        private  int  age;
        private  String  tel;
        public  void  test(){
            InnerClassDemo innerClassDemo=new InnerClassDemo();
            innerClassDemo.setName("张三");
            System.out.println(innerClassDemo.getName()+"----"+InnerClassDemo.this.num+"----"+InnerClassDemo.this.realname);
        }
    }

    //静态内部类
    static  class  StaticInnerClass{

    }
}
