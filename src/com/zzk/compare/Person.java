package com.zzk.compare;

/**
 * 内部比较器
 */
public class Person implements Comparable{
    private  String  name;
    private  int  age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Person p=(Person) o;
        if(p.name.length()>this.name.length()){
              return 1;
        }else if (p.name.length()<this.name.length()){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
