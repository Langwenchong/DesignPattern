package main.java.com.chong.strategy;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 21:55
 * @Version 1.0
 */
public class StrategyB implements Strategy {
    @Override
    public void show() {
        System.out.println("满200减50");
    }
}
