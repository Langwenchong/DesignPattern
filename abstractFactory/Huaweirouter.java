package main.java.com.chong.abstractFactory;

/**
 * @Author Lang wenchong
 * @Date 2021/11/8 9:39
 * @Version 1.0
 */
public class Huaweirouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("打开华为路由器");
    }

    @Override
    public void shutDown() {
        System.out.println("关闭华为路由器");
    }

    @Override
    public void openWifi() {
        System.out.println("打开华为wifi");
    }

    @Override
    public void setting() {
        System.out.println("关闭华为wifi");
    }
}
