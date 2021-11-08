package main.java.com.chong.decorate;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 15:25
 * @Version 1.0
 */

//快餐类,抽象构建角色
public abstract class FastFood {
    private float price;//价格
    private String desc;//具体的描述

    public abstract float cost();

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}
