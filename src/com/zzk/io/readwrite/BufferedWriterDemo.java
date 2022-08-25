package com.zzk.io.readwrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter=new FileWriter("F:\\测试\\BufferedWriterDemo.txt");
            bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("测试测试测试测试测试学习，学习学学学学");
            //换行
            bufferedWriter.newLine();
            bufferedWriter.append("6天时间三亚感染者超800例，海南省长：做好打大仗的准备");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
