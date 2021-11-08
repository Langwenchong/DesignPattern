package main.java.com.chong.abstractFactory;

/**
 * @Author Lang wenchong
 * @Date 2021/11/8 9:39
 * @Version 1.0
 */
public class Huaweiphone implements IphoneProduct {
    @Override
    public void start() {
        System.out.println("打开华为手机");
    }

    @Override
    public void shutDown() {
        System.out.println("关闭华为手机");
    }

    @Override
    public void callUp() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("华为手机发短信");
    }
}
