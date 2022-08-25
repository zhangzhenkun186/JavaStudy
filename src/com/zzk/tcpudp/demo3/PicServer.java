package com.zzk.tcpudp.demo3;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PicServer {
    public static void main(String[] args) throws  Exception{
        //创建文件输出流
        FileOutputStream fileOutputStream=new FileOutputStream("F:\\测试\\春节10.jpg");
        ServerSocket serverSocket=new ServerSocket(10086);
        //接收照片
        Socket socket = serverSocket.accept();
        InputStream inputStream=socket.getInputStream();
        byte[] buffer=new byte[1024];
        int temp=0;
        while ((temp=inputStream.read())!=-1){
            fileOutputStream.write(temp);
        }
        //关闭socket输入流
        socket.shutdownInput();
        //给客户端反馈数据
        OutputStream outputStream=socket.getOutputStream();
        outputStream.write("接收照片成功！！！".getBytes());
        //关闭socket输出流
        socket.shutdownOutput();
        //关闭流
        outputStream.close();
        inputStream.close();
        fileOutputStream.close();
        socket.close();
        serverSocket.close();
    }
}
