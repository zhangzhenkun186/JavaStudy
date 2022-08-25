package com.zzk.tcpudp.demo4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket=new ServerSocket(10086);
        Socket socket=serverSocket.accept();
        //接收对象
        InputStream inputStream=socket.getInputStream();
        ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
        User user= (User) objectInputStream.readObject();
        String str="";
        if("zzk".equals(user.getUsername())&&"12345".equals(user.getPassword())){
            System.out.println("欢迎："+user.getUsername());
            str="登录成功";
        }else{
            str="登录失败";
        }
        socket.shutdownInput();
        //给客户端反馈
        OutputStream outputStream=socket.getOutputStream();
        DataOutputStream dataOutputStream=new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(str);
        socket.shutdownOutput();
        //关闭流
        outputStream.close();
        dataOutputStream.close();
        inputStream.close();
        objectInputStream.close();
        socket.close();
        serverSocket.close();
    }
}
