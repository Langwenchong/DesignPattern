package main.java.com.chong.abstractFactory;

/**
 * @Author Lang wenchong
 * @Date 2021/11/8 9:40
 * @Version 1.0
 */
public class HuaweiFactory implements IProductFactory {
    //生产华为产品族，并且满足抽象工厂的开发模式，可扩展性强

    @Override
    public IphoneProduct iphoneProduct() {
        return new Huaweiphone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new Huaweirouter();
    }
}
