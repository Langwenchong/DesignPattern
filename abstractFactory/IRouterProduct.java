package main.java.com.chong.abstractFactory;

/**
 * @Author Lang wenchong
 * @Date 2021/11/8 9:36
 * @Version 1.0
 */
//第二个产品等级产品--路由器的抽象功能接口
public interface IRouterProduct {
    void start();

    void shutDown();

    void openWifi();

    void setting();
}
