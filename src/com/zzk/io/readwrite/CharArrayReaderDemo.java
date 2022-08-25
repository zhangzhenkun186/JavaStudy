package com.zzk.io.readwrite;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String  str="测试环境下测试学习";
        char[] chars=str.toCharArray();
        CharArrayReader charArrayReader=new CharArrayReader(chars);
        try {
            int read=0;
            while((read=charArrayReader.read())!=-1){
                System.out.println((char)read);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            charArrayReader.close();
        }

    }
}
