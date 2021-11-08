package main.java.com.chong.visitor;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 17:11
 * @Version 1.0
 */
public class Someone implements Person {
    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂狗");
    }
}
