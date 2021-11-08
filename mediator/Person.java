package main.java.com.chong.mediator;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 16:25
 * @Version 1.0
 */

//抽象同事类
public abstract class Person {
    protected  String name;
    protected  Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
