package main.java.com.chong.strategy;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 21:56
 * @Version 1.0
 */
public class StrategyC implements Strategy {
    @Override
    public void show() {
        System.out.println("满1000元加一元购买任意200元以下商品");
    }
}
