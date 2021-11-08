package main.java.com.chong.adapter.class_adapter;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 15:02
 * @Version 1.0
 */
//计算机只能读sd卡
public class Computer {
    //从SD卡读取数据
    public String readSD(SDCard sdCard){
        if(sdCard==null){
            throw new NullPointerException("sd card can not  be null");
        }
        return sdCard.readSD();
    }

}
