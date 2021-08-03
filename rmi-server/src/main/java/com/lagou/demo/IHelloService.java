package com.lagou.demo;

import com.lagou.pojo.User;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHelloService extends Remote {

    //1.定义一个sayHello方法
    public  String sayHello(User user) throws RemoteException;
}
