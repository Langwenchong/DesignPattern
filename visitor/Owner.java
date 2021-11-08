package main.java.com.chong.visitor;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 17:10
 * @Version 1.0
 */
public class Owner implements Person {

    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂狗");
    }
}
