package main.java.com.chong.factory;

/**
 * @Author Lang wenchong
 * @Date 2021/11/8 9:24
 * @Version 1.0
 */
public class TeslaFactory implements CarFactory {

    public Car getCar() {
        return new Tesla(280, 40000, 6);
    }
}
