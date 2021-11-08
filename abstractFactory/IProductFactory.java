package main.java.com.chong.abstractFactory;

/**
 * @Author Lang wenchong
 * @Date 2021/11/8 9:37
 * @Version 1.0
 */
//抽象产品工厂定义具体工厂可以生产的产品等级
public interface IProductFactory {
    //生产手机
    IphoneProduct iphoneProduct();

    //生产路由器
    IRouterProduct routerProduct();
}
