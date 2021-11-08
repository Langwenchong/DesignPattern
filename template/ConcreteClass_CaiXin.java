package main.java.com.chong.template;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 21:45
 * @Version 1.0
 */
public class ConcreteClass_CaiXin extends AbstractClass {
    @Override
    public void pourVagetable() {
        System.out.println("下锅的是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的是蒜蓉");
    }
}
