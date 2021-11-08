package main.java.com.chong.template;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 21:44
 * @Version 1.0
 */

//炒包菜类
public class ConcreteClass_BaoCai extends AbstractClass {

    @Override
    public void pourVagetable() {
        System.out.println("下锅的是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的是辣椒");
    }
}
