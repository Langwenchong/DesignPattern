package main.java.com.chong.adapter.object_adapter;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 15:04
 * @Version 1.0
 */

//比类适配器要好
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //读取sd卡中的数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("==============================");

        //使用该计算机读取TFCard中的数据
        //创建适配器类对象
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        String msg1 = computer.readSD(sdAdapterTF);
        System.out.println(msg1);
    }
}
