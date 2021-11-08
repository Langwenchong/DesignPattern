package main.java.com.chong.abstractFactory;

/**
 * @Author Lang wenchong
 * @Date 2021/11/8 9:36
 * @Version 1.0
 */
//第一个产品等级产品--手机的抽象功能接口
public interface IphoneProduct {
    void start();

    void shutDown();

    void callUp();

    void sendSMS();
}
