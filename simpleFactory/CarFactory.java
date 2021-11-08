package main.java.com.chong.simpleFactory;

/**
 * @Author Lang wenchong
 * @Date 2021/10Car
 * Consumer
 * WuLing
 * Tesla/21 21:36
 * @Version 1.0
 */
public class CarFactory {
    public static Car getCar(String car) {
        if (car.equals("五菱")) {
            return new WuLing(200, 30000, 2);
        } else if (car.equals("特斯拉")) {
            return new Tesla(280, 40000, 6);
        } else {
            return null;
        }
    }
}
