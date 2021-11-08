package main.java.com.chong.command;

import java.util.Map;
import java.util.Set;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 22:14
 * @Version 1.0
 */
public class OrderCommand implements Command {

    //持有接受者对象
    private SeniorChef receiver;
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "的订单：");
        Map<String, Integer> foodDir = order.getFoodDir();
        Set<String> keys = foodDir.keySet();
        for (String foodName : keys) {
            receiver.makeFood(foodName, foodDir.get(foodName));
        }
        System.out.println(order.getDiningTable() + "桌的饭菜准备完毕");
    }
}
