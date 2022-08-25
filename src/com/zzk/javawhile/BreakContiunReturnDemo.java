package com.zzk.javawhile;

public class BreakContiunReturnDemo {
    public static void main(String[] args) {

      /*  for(int i=0;i<=10;i++){
            if(i==5){
                continue;
                return;
            }
            System.out.println(i+"---接着执行");
        }*/
        for(int i=0;i<=10;i++){
            for(int j=1;j<=i;j++){
                if(i==6&&j==6){
                    break;
                };
                System.out.println(i+"--"+j);
            }
        }
    }
}
