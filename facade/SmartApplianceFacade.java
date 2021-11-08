package main.java.com.chong.facade;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 20:09
 * @Version 1.0
 */

//外观对象，核心身份
public class SmartApplianceFacade {
    //要聚合电灯、电势和空调 对象
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    //懒汉式初始化
    public SmartApplianceFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    //通过语音控制
    public void say(String msg) {
        if (msg.contains("打开")) {
            on();
        } else if (msg.contains("关闭")) {
            off();
        } else {
            System.out.println("我还听不懂你说的是什么");
        }
    }

    private void on() {
        light.on();
        tv.on();
        airCondition.on();
    }

    private void off() {
        light.off();
        tv.off();
        airCondition.off();
    }
}
