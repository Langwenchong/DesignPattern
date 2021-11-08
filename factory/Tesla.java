package main.java.com.chong.factory;

/**
 * @Author Lang wenchong
 * @Date 2021/11/8 9:23
 * @Version 1.0
 */
public class Tesla implements Car {
    @Override
    public void name() {
        System.out.println("特斯拉!");
    }

    private int weight;
    private int price;
    private int capacity;

    public Tesla(int weight, int price, int capacity) {
        this.weight = weight;
        this.price = price;
        this.capacity = capacity;
    }
}
