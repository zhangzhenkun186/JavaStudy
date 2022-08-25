package com.zzk.io;

import java.io.*;

/**
 * 读取图片使用字节流，因为字节流是万能的
 */
public class CopyPicture {
    public static void main(String[] args) {
        File  src=new File("F:\\测试\\春节0.jpg");
        File  dist=new File("F:\\测试\\春节11.jpg");
        //创建字节输入输出流
        FileInputStream  fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        try {
            fileInputStream=new FileInputStream(src);
            fileOutputStream=new FileOutputStream(dist);
            //创建缓冲区
            byte[]  buffer=new  byte[1024];
            int length=0;
            while ((length=fileInputStream.read(buffer))!=-1){
                 fileOutputStream.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
