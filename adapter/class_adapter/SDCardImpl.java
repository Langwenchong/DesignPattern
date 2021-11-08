package main.java.com.chong.adapter.class_adapter;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 15:01
 * @Version 1.0
 */


public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "SDCard read msg: hello world!";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg:" + msg);
    }
}
