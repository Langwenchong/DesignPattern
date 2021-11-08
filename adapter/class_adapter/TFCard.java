package main.java.com.chong.adapter.class_adapter;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 14:56
 * @Version 1.0
 */

//适配者类的接口
public interface TFCard {
    //从TF卡中读取数据
    String readTF();
    //向TF卡中写数据
    void writeTF(String msg);
}
