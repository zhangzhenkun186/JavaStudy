package com.zzk.io.handio;

import java.io.*;

//字节处理流----提高效率
public class OutputStreamWriterDemo {
    public static void main(String[] args) {
        File file=new File("F:\\测试\\OutputStreamWriterDemo.txt");
        FileOutputStream fileOutputStream=null;
        OutputStreamWriter outputStreamWriter=null;
        try {
            fileOutputStream=new FileOutputStream(file);
            outputStreamWriter=new OutputStreamWriter(fileOutputStream,"utf-8");
            outputStreamWriter.write("测试啦啦啦啦啦啦啦");
            outputStreamWriter.write(1111111111);
            outputStreamWriter.write("aaaaaaaaaaaaaaaaaaaaaaa",0,15);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStreamWriter.flush();
                outputStreamWriter.close();
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
