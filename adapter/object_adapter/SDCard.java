package main.java.com.chong.adapter.object_adapter;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 14:59
 * @Version 1.0
 */

//目标者接口
public interface SDCard {
    //从SD卡中读取数据
    String readSD();
    //向SD卡写数据
    void writeSD(String msg);
}
