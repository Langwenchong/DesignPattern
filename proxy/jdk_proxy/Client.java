package main.java.com.chong.proxy.jdk_proxy;

import main.java.com.chong.proxy.static_proxy.ProxyPoint;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 16:35
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //获取代理对象
        //1.创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //2.使用factory对象的方法获取代理对象
        SellTicket proxyObject = factory.getProxyObject();
        //3.调用卖调用的方法
        proxyObject.sell();
    }
}
