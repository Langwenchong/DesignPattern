package main.java.com.chong.visitor;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 17:05
 * @Version 1.0
 */

//抽象访问者角色类
public interface Person {
    //喂食宠物
    void feed(Cat cat);

    void feed(Dog dog);
}
