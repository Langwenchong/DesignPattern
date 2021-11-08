package main.java.com.chong.decorate;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 15:42
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //点一份炒饭
        FastFood friedRice = new FriedRice();
        System.out.println(friedRice.getDesc() + " " + friedRice.cost() + "元");
        System.out.println("================");
        //将上面的炒饭再加一个鸡蛋
        friedRice = new Egg(friedRice);
        System.out.println(friedRice.getDesc() + " " + friedRice.cost() + "元");
        System.out.println("================");
        //再加一个鸡蛋
        friedRice = new Egg(friedRice);
        System.out.println(friedRice.getDesc() + " " + friedRice.cost() + "元");
        System.out.println("================");
        //再加一个培根
        friedRice = new Bacon(friedRice);
        System.out.println(friedRice.getDesc() + " " + friedRice.cost() + "元");
    }
}
