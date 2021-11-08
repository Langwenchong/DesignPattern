package main.java.com.chong.proxy.static_proxy;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 16:17
 * @Version 1.0
 */

//火车票代售点
public class ProxyPoint implements SellTicket {
    //声明火车站类对象
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取一定的服务费用");
        trainStation.sell();
    }
}
