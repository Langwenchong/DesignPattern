package main.java.com.chong.adapter.object_adapter;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 15:07
 * @Version 1.0
 */

//适配器
//不需要使用继承
public class SDAdapterTF implements SDCard {

    //声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        //实际上适配器是去读TF卡中的数据
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
