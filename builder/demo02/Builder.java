package main.java.com.chong.builder.demo02;

/**
 * @Author Lang wenchong
 * @Date 2021/10/22 17:02
 * @Version 1.0
 */

//抽象类，也可以使用接口，最终功能一致
public abstract class Builder {
    abstract Builder buildA(String msg);//汉堡

    abstract Builder buildB(String msg);//可乐

    abstract Builder buildC(String msg);//薯条

    abstract Builder buildD(String msg);//蛋挞

    abstract Product getProduct();
}
