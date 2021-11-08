package main.java.com.chong.factory;

/**
 * @Author Lang wenchong
 * @Date 2021/11/8 9:24
 * @Version 1.0
 */
public class WulingFactory implements CarFactory {
    public Car getCar() {
        return new Wuling(200, 30000, 2);
    }
}
