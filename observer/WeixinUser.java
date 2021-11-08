package main.java.com.chong.observer;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 15:52
 * @Version 1.0
 */
public class WeixinUser implements Observer {

    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + "-" + msg);
    }
}
