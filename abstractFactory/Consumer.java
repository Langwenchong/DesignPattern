package main.java.com.chong.abstractFactory;

/**
 * @Author Lang wenchong
 * @Date 2021/11/8 9:36
 * @Version 1.0
 */
public class Consumer {
    public static void main(String[] args) {
        System.out.println("小米系列产品");
        //小米工厂
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        //获取一台小米手机
        IphoneProduct iphoneProduct1 = xiaomiFactory.iphoneProduct();
        iphoneProduct1.callUp();
        iphoneProduct1.sendSMS();

        //获取一台小米路由器
        IRouterProduct iRouterProduct1 = xiaomiFactory.routerProduct();
        iRouterProduct1.openWifi();
        iRouterProduct1.setting();

        System.out.println("华为系列产品");
        //华为工厂
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        //获取一台华为手机
        IphoneProduct iphoneProduct2 = huaweiFactory.iphoneProduct();
        iphoneProduct2.callUp();
        iphoneProduct2.sendSMS();

        //获取一台华为路由器
        IRouterProduct iRouterProduct2 = huaweiFactory.routerProduct();
        iRouterProduct2.openWifi();
        iRouterProduct2.setting();
    }
}
