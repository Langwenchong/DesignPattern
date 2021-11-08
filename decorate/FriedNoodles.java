package main.java.com.chong.decorate;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 15:30
 * @Version 1.0
 */

//炒面，具体构建角色
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
