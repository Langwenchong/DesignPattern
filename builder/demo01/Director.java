package main.java.com.chong.builder.demo01;

/**
 * @Author Lang wenchong
 * @Date 2021/10/22 16:41
 * @Version 1.0
 */

//具体的指挥者，他来只会工人按顺序创建产品
//核心
public class Director {
    //指挥者有一个开始指挥构建产品的函数
    //他需要接收传进来一个工人即具体的实现Builder类实例
    public Product build(Builder builder){
        //他在指挥 着这个工人按照一定的顺序来盖房子
        //这里指挥工人按照A-B-C-D顺序构建房子
        //他负责具体的房子结构组装
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        //最终从工人那里拿到盖好的房子
        //然后指挥者来向客户交付产品
        return builder.getProduct();
    }

}
