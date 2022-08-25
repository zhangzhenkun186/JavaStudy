package com.zzk.io;

import java.io.*;

/**
 * 读取图片使用字节流，因为字节流是万能的
 */
public class CopyVideo {
    public static void main(String[] args) {
        File  src=new File("F:\\KuGou\\纯音乐 - 清心普善咒.mp3");
        File  dist=new File("F:\\KuGou\\清心.mp3");
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
