package main.java.com.chong.strategy;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 21:59
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //春节来了，使用春节促销活动
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
        System.out.println("==============");
        //中秋节来了，使用中秋节活动
        salesMan.setStrategy(new StrategyB());
        salesMan.salesManShow();
        //圣诞节来了，使用圣诞节活动
        salesMan.setStrategy(new StrategyC());
        salesMan.salesManShow();
    }
}
