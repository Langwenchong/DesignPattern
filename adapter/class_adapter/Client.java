package main.java.com.chong.adapter.class_adapter;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 15:04
 * @Version 1.0
 */

//类适配器违背了合成复用原则
public class Client {
    public static void main(String[] args) {
        Computer computer =new Computer();
        //读取sd卡中的数据
        String msg=computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("==============================");

        //使用该计算机去读取TFCard中的数据，明显需要适配器
        //定义适配器类

        String msg1=computer.readSD(new SDAdapterTF());
        System.out.println(msg1);
    }
}
