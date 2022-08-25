package com.zzk.io;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        //定义要读取的文件
        File  src=new File("F:\\abc.txt");
        //定义要写入的文件
        File  dist=new File("F:\\dist.txt");

        //创建输入流对象
        InputStream  inputStream=null;
        //创建输出流对象
        OutputStream outputStream=null;

        try {
            inputStream=new FileInputStream(src);
            outputStream=new FileOutputStream(dist);

            //带缓存的输入输出方式
            byte[] buffer=new byte[1024];
            //每次文件读取长度
            int  length=0;

            while(inputStream.read(buffer)!=-1){
                outputStream.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
