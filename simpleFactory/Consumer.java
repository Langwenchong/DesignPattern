package main.java.com.chong.simpleFactory;

/**
 * @Author Lang wenchong
 * @Date 2021/10/21 21:40
 * @Version 1.0
 */
public class Consumer {
    public static void main(String[] args) {
        //原先如果要购买两辆车，需要如下声明
        //需要了解所有的先关的车接口和实现类
        //相当与自己创建车
        //每次创建参数都要重新再填写一次
//        Car car1 = new WuLing(200, 30000, 2);
//        Car car2 = Tesla(280, 40000, 6);;
//
//        car1.name();
//        car2.name();

        //现在我们只需要调用CarFactory的接口即可获取
        //可以和显示生活中的购买车类比
        //车工厂负责造车，消费者只买车
        //简化了多次填写重复参数的过程
        Car car3 = CarFactory.getCar("五菱");
        Car car4 = CarFactory.getCar("特斯拉");
        car3.name();
        car4.name();
    }
}
