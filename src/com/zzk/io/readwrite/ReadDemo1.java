package com.zzk.io.readwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadDemo1 {
    public static void main(String[] args) {
        Reader reader=null;
        try {
            reader=new FileReader("F:\\abc.txt");
            int read=0;
            while ((read=reader.read())!=-1){
                System.out.print((char) read);
            }
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
