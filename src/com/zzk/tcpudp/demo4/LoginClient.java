package com.zzk.tcpudp.demo4;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class LoginClient {
    public static void main(String[] args) throws Exception{

        Socket socket=new Socket("127.0.0.1",10086);
        //客户端发送对象
        OutputStream outputStream=socket.getOutputStream();
        //传递对象需要使用ObjectOutputStream
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
        User user=getUser();
        objectOutputStream.writeObject(user);
        socket.shutdownOutput();
        //接收登录结果
        InputStream inputStream=socket.getInputStream();
        DataInputStream dataInputStream=new DataInputStream(inputStream);
        String string=dataInputStream.readUTF();
        System.out.println(string);
        socket.shutdownInput();
        //关闭流
        inputStream.close();
        dataInputStream.close();
        outputStream.close();
        objectOutputStream.close();
        socket.close();

    }
    public static User getUser(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username=scanner.nextLine();
        System.out.println("请输入密码：");
        String passowrd=scanner.nextLine();
        return  new User(username,passowrd);
    }
}
