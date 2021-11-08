package main.java.com.chong.builder.demo01;

/**
 * @Author Lang wenchong
 * @Date 2021/10/22 16:31
 * @Version 1.0
 */

//抽象的Builder，不提供具体的建造实现
//仅仅定义建造的步骤
//注意这里使用接口或者抽象类都是相同的作用
//表示抽象的功能,这里用抽象类表示
public abstract class Builder {
    abstract void buildA();//地基
    abstract void buildB();//钢筋水泥
    abstract void buildC();//铺电线
    abstract void buildD();//粉刷

    //完工交付产品
    abstract Product getProduct();
}
