package com.zzk.tcpudp.demo2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        //往localhost服务器上发送数据
        try {
            Socket client = new Socket("localhost", 10086);
            //发送数据
            OutputStream outputStream = client.getOutputStream();
            outputStream.write("hello  你好！！！".getBytes());
            //接收数据
            InputStream inputStream = client.getInputStream();
            byte[] buff=new byte[1024];
            int length = inputStream.read(buff);
            System.out.println("服务端回复的数据是："+new String(buff,0,length));
            outputStream.close();
            inputStream.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
