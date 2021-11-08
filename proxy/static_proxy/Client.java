package main.java.com.chong.proxy.static_proxy;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 16:20
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建代售点对象
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
