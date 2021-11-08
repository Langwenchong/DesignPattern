package main.java.com.chong.builder.demo01;

/**
 * @Author Lang wenchong
 * @Date 2021/10/22 16:45
 * @Version 1.0
 */

//我们客户身份
public class Consumer {
    public static void main(String[] args) {
        //创建一个指挥者
        Director director = new Director();
        //我们只需要命令指挥者开始搭建房子即可
        //具体后面的指挥者如何指挥工人搭建房子
        //甚至房子的组成结构我们一概不知也无需关心
        Product p = director.build(new Worker());
        System.out.println(p.toString());

    }
}
