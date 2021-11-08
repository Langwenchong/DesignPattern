package main.java.com.chong.adapter.class_adapter;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 15:07
 * @Version 1.0
 */

//适配器
//使用继承不太好，造成了违背合成复用原则
public class SDAdapterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        //实际上适配器是去读TF卡中的数据
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
