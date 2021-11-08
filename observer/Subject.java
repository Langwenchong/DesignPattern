package main.java.com.chong.observer;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 15:46
 * @Version 1.0
 */

//抽象主题角色类
public interface Subject {
    //添加订阅者或者观察者对象
    void attach(Observer observer);

    //删除订阅者
    void detach(Observer observer);

    //通知观察者更新消息
    void notify(String msg);
}
