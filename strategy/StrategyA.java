package main.java.com.chong.strategy;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 21:54
 * @Version 1.0
 */

public class StrategyA implements Strategy {
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
