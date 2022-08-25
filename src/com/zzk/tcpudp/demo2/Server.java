package com.zzk.tcpudp.demo2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
            byte[] buff=new byte[1024];
            int length = inputStream.read(buff);
            System.out.println("客户端发送的数据是："+new String(buff,0,length));
            //发送数据
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("收到了数据".getBytes());
            outputStream.close();
            inputStream.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
