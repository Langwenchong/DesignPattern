package main.java.com.chong.template;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 21:46
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //炒包菜
        ConcreteClass_BaoCai baoCai = new ConcreteClass_BaoCai();
        //炒菜
        baoCai.cookProcess();
        System.out.println("===============");
        ConcreteClass_CaiXin caiXin = new ConcreteClass_CaiXin();
        caiXin.cookProcess();
    }
}
