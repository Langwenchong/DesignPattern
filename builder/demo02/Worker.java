package main.java.com.chong.builder.demo02;

/**
 * @Author Lang wenchong
 * @Date 2021/10/22 17:08
 * @Version 1.0
 */

//具体的建造者，服务员
public class Worker extends Builder{
    //这里体现了懒汉式单例创建
    private Product product;
    public Worker(){
        //注意产品的创建还是由创建者来完成
        product=new Product();
    }

    @Override
    Builder buildA(String msg) {
        //修改套餐的第一个食品
        product.setBuildA(msg);

        //注意这里优点不好理解
        //返回的是当前的worker实例，由于这个worker内部包含了一个产品
        //因此间接的这个worker所更改创建的套餐也返还了
        //这就是静态内部类的体现
        return this;
    }

    @Override
    Builder buildB(String msg) {
        product.setBuildB(msg);
        return this;
    }

    @Override
    Builder buildC(String msg) {
        product.setBuildC(msg);
        return this;
    }

    @Override
    Builder buildD(String msg) {
        product.setBuildD(msg);
        return this;
    }

    @Override
    Product getProduct() {
        //返还当前worker所携带的产品
        return product;
    }
}
