package com.zzk.tcpudp.demo3;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class PicClient {
    public static void main(String[] args) throws Exception{
        FileInputStream  fileInputStream=new FileInputStream("F:\\测试\\春节0.jpg");
        Socket  socket=new Socket("127.0.0.1",10086);
        //发送图片
        OutputStream outputStream=socket.getOutputStream();
        int temp=0;
        while ((temp=fileInputStream.read())!=-1){
            outputStream.write(temp);
        }
        //关闭socket输出
        socket.shutdownOutput();
        //接收服务器数据
        InputStream inputStream=socket.getInputStream();
        byte[] buffer=new byte[1024];
        int length = inputStream.read(buffer);
        System.out.println("服务器返回："+new String(buffer,0,length));
        //关闭socket输入流
        socket.shutdownInput();
        //关闭流
        inputStream.close();
        outputStream.close();
        socket.close();
        fileInputStream.close();
    }
}
