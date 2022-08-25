package com.zzk.io.readwrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo2 {
    public static void main(String[] args) {
        File file=new File("F:\\writerDemo.txt");
        //这种写法，不用再去写finally去关闭流
        try (Writer writer=new FileWriter(file);){
            writer.write("测试");
            writer.write("zzk");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
