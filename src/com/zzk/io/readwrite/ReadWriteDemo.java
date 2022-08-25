package com.zzk.io.readwrite;

import java.io.*;

public class ReadWriteDemo {
    public static void main(String[] args) {
        File src=new File("F:\\abc.txt");
        File dist=new File("F:\\readwrite.txt");
        Reader reader =null;
        Writer writer=null;
        try {
            //字节流
           reader = new FileReader(src);
           writer=new FileWriter(dist);

           //缓冲区
            char[]  chars=new  char[1024];
            int  length=0;
            while ((length=reader.read(chars))!=-1){
                writer.write(chars);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
                //最保险的是在输出流关闭之前flush一下
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
