package com.zzk.io.readwrite;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        File file=new File("F:\\测试\\后续工作安排.txt");
        BufferedReader  bufferedReader=null;
        try {
            bufferedReader=new BufferedReader(new FileReader(file));
            String read=null;
            while ((read=bufferedReader.readLine())!=null){
                System.out.println(read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
