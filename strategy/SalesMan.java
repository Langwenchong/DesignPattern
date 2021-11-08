package main.java.com.chong.strategy;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 21:57
 * @Version 1.0
 */

//环境类
public class SalesMan {
    //聚合策略类对象
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    //由促销员展示促销活动给普通用户
    public void salesManShow() {
        strategy.show();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
