package main.java.com.chong.flyweight;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 20:59
 * @Version 1.0
 */

//抽象享元角色
public abstract class AbstractBox {
    //获取图形的方法
    public abstract String getShape();

    //显示图形和颜色
    public void display(String color) {
        System.out.println("方块形状:" + getShape() + "," + "颜色：" + color);
    }
}
