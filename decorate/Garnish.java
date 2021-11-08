package main.java.com.chong.decorate;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 15:32
 * @Version 1.0
 */

//装饰类,抽象，因为会有许多不同的具体装饰配料，抽象装饰
public abstract class Garnish extends FastFood {
    //声明快餐类变量
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }


}
