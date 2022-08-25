package com.zzk.io.readwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadDemo2 {
    public static void main(String[] args) {
        Reader reader=null;
        try {
            reader=new FileReader("F:\\abc.txt");
            int length=0;
            //带缓冲区读取
            char[]  buffer=new char[1024];
            while ((length=reader.read(buffer))!=-1){
                System.out.print(new String(buffer,0,length));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
