package com.zzk.enumdemo;

public enum Gender {
    MAN(1,"男"),WOMAN(2,"女");
    private  int  code;
    private  String name;

    Gender(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
