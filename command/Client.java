package main.java.com.chong.command;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 22:23
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("西红柿鸡蛋面", 1);
        order1.setFood("小杯可乐", 2);

        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("尖叫肉丝盖饭", 1);
        order2.setFood("小杯雪碧", 1);


        //创建厨师
        SeniorChef receiver = new SeniorChef();
        //创建命令对象
        OrderCommand cmd1 = new OrderCommand(receiver, order1);
        OrderCommand cmd2 = new OrderCommand(receiver, order2);
        //创建服务员
        Waitor waitor = new Waitor();
        waitor.setCommand(cmd1);
        waitor.setCommand(cmd2);
        waitor.orderUp();
    }
}
