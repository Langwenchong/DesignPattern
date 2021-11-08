package main.java.com.chong.proxy.static_proxy;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 16:17
 * @Version 1.0
 */

//火车站类
public class TrainStation implements SellTicket {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
