package main.java.com.chong.builder.demo01;

/**
 * @Author Lang wenchong
 * @Date 2021/10/22 16:37
 * @Version 1.0
 */

//具体的Builder实现
public class Worker extends Builder {
    //工人仅仅是会做这些工作的，但是如果没有人指挥他并不会做
    //即他不知道盖房子的具体步骤，只是会搭建房子的一系列操作

    private Product product;

    public Worker() {
        //一定要注意是工人这个具体Builder来创建产品
        //抽象的Builder仅仅定义方法和实现顺序
        product = new Product();
    }

    @Override
    void buildA() {
        //先达地基
        product.setBuildA("地基");
    }

    @Override
    void buildB() {
        product.setBuildB("钢筋工程");
    }

    @Override
    void buildC() {
        product.setBuildC("铺电线");
    }

    @Override
    void buildD() {
        product.setBuildD("粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
