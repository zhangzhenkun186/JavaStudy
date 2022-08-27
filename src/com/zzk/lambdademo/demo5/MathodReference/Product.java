package com.zzk.lambdademo.demo5.MathodReference;

/**
 * 商品
 */
public class Product {
    private  String name;
    private  double  price;
    private  String  card;

    public Product() {
        System.out.println("无参构造方法引用......");
    }

    public Product(String name, double price) {
        System.out.println("两个参数构造方法引用:"+name+"===="+price);
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, String card) {
        this.name = name;
        this.price = price;
        this.card=card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public  static Integer  init(){
        return 1;
    }
    public  static String  getName(String  name){
        return name;
    }
    public   String  getName2(String  name){
        return name;
    }
    public Double getCount(Double price,Integer num){
          return price*num;
    }
    public String getNameCard(String name,String card){
        return  name+"===="+card;
    }
}
