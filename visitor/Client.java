package main.java.com.chong.visitor;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 17:11
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建Home对象
        Home home = new Home();
        home.add(new Dog());
        home.add(new Cat());
        Owner owner = new Owner();
        home.action(owner);
    }
}
