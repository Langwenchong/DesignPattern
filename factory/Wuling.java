package main.java.com.chong.factory;

/**
 * @Author Lang wenchong
 * @Date 2021/11/8 9:22
 * @Version 1.0
 */
public class Wuling implements Car {
    @Override
    public void name() {
        System.out.println("五菱宏光!");
    }

    private int weight;
    private int price;
    private int capacity;

    public Wuling(int weight, int price, int capacity) {
        this.weight = weight;
        this.price = price;
        this.capacity = capacity;
    }
}
