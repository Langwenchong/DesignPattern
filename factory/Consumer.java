package main.java.com.chong.factory;

/**
 * @Author Lang wenchong
 * @Date 2021/11/8 9:22
 * @Version 1.0
 */
public class Consumer {
    public static void main(String[] args) {

        //获取不同类型的车

        Car car1 = new WulingFactory().getCar();
        Car car2 = new TeslaFactory().getCar();
        car1.name();
        car2.name();
    }
}
