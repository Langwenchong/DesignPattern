package main.java.com.chong.abstractFactory;

/**
 * @Author Lang wenchong
 * @Date 2021/11/8 9:37
 * @Version 1.0
 */
//小米手机具体实现类
public class Xiaomiphone implements IphoneProduct {

    @Override
    public void start() {
        System.out.println("开启小米手机");
    }

    @Override
    public void shutDown() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void callUp() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("小米手机发短信");
    }
}

