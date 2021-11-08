package main.java.com.chong.decorate;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 15:35
 * @Version 1.0
 */

//第一个装饰配料鸡蛋，具体装饰者角色
public class Egg extends Garnish {
    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
