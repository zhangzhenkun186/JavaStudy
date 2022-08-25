package com.zzk.io.readwrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
    public static void main(String[] args) {
        File file=new File("F:\\writerDemo.txt");
        Writer writer=null;
        try {
            writer=new FileWriter(file);
            writer.write("测试");
            writer.write("zzk");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //最保险的是在输出流关闭之前flush一下
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
