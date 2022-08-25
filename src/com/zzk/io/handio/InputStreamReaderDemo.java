package com.zzk.io.handio;

import java.io.*;

/**
 * 字节处理流----提高效率
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) {

        File  file=new File("F:\\abc.txt");
        FileInputStream  fileInputStream=null;
        InputStreamReader  inputStreamReader=null;
        try {
            fileInputStream=new FileInputStream(file);
            inputStreamReader=new InputStreamReader(fileInputStream,"utf-8");
            char[] chars=new char[1024];
            int length=inputStreamReader.read(chars);
            System.out.println(new String(chars,0,length));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStreamReader.close();
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
