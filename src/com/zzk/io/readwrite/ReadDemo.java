package com.zzk.io.readwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadDemo {
    public static void main(String[] args) {
        Reader reader=null;
        try {
            reader=new FileReader("F:\\abc.txt");
            int read=reader.read();
            System.out.print((char)read);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
