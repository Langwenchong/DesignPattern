package main.java.com.chong.facade;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 20:14
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建一个智能音箱即可
        SmartApplianceFacade smartApplianceFacade = new SmartApplianceFacade();
        smartApplianceFacade.say("我想打开家电");
        System.out.println("=========================");
        smartApplianceFacade.say("我困了，想关闭家电");
    }
}
