package main.java.com.chong.mediator;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 16:26
 * @Version 1.0
 */

//具体同事角色类
public class Tenant extends Person {
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    //和中介者联系方法
    public void contact(String msg) {
        mediator.contact(msg, this);
    }

    //获取信息的方法
    public void getMessage(String msg) {
        System.out.println("租房者" + name + "获取到的信息是：" + msg);
    }

}
