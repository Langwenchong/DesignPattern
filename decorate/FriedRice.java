package main.java.com.chong.decorate;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 15:28
 * @Version 1.0
 */


//炒饭，具体构建角色
public class FriedRice extends FastFood{
    public FriedRice(){
        //基础价格和描述
        super(10,"炒饭");
    }
    @Override
    public float cost() {
        return getPrice();
    }
}
