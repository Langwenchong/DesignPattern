package main.java.com.chong.visitor;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 17:06
 * @Version 1.0
 */

//抽象元素角色类
public interface Animal {
    //接收访问者访问的功能
    void accept(Person person);


}
