package com.zzk.tcpudp.demo1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            //打开端口
            ServerSocket  serverSocket=new ServerSocket(10086);
            //接收client发送的数据
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream=new DataInputStream(inputStream);
            String str = dataInputStream.readUTF();
            System.out.println(str);
            dataInputStream.close();
            inputStream.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
