package main.java.com.chong.flyweight;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 21:09
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //获取I图形
        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        box1.display("灰色");

        AbstractBox box2 = BoxFactory.getInstance().getShape("L");
        box2.display("绿色");

        AbstractBox box3 = BoxFactory.getInstance().getShape("O");
        box3.display("红色");

        AbstractBox box4 = BoxFactory.getInstance().getShape("O");
        box4.display("黄色");

        System.out.println("两次获取到的O图形对象是否为同一个对象" + (box3 == box4));
        //颜色是外部状态，并不会真正的修改内部的状态，同一个形状类型的对象共享，节省空间
    }
}
