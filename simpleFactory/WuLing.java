package main.java.com.chong.simpleFactory;

/**
 * @Author Lang wenchong
 * @Date 2021/10/21 21:38
 * @Version 1.0
 */
public class WuLing implements Car {
    @Override
    public void name() {
        System.out.println("五菱宏光!");
    }

    private int weight;
    private int price;
    private int capacity;

    public WuLing(int weight, int price, int capacity) {
        this.weight = weight;
        this.price = price;
        this.capacity = capacity;
    }
}
