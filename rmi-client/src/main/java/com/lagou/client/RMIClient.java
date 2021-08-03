package com.lagou.client;

import com.lagou.demo.IHelloService;
import com.lagou.pojo.User;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class RMIClient {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        //1.从注册表中获取远程对象 , 强转
        IHelloService service = (IHelloService) Naming.lookup("//127.0.0.1:8888/rmiserver");

        //2.准备参数
        User user = new User("laowang",18);

        //3.调用远程方法sayHello
        String message = service.sayHello(user);
        System.out.println(message);
    }
}
