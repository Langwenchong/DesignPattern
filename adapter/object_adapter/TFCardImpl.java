package main.java.com.chong.adapter.object_adapter;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 14:57
 * @Version 1.0
 */

//实现适配者接口
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg="TFCard read msg: hello world TFCard!";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg: "+msg);
    }
}
