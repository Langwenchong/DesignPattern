package main.java.com.chong.template;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 21:38
 * @Version 1.0
 */
public abstract class AbstractClass {

    //模板方法定义
    public final void cookProcess() {
        pourOil();
        heatOil();
        pourVagetable();
        fry();
    }

    //基本方法
    //第一步
    public void pourOil() {
        System.out.println("倒油");
    }

    //第二步热油是一样的，直接实现
    public void heatOil() {
        System.out.println("热油");
    }

    //第三步要倒的菜是不同的，因此这里方法维持抽象
    public abstract void pourVagetable();

    //第四步倒的调料不一样，也抽象
    public abstract void pourSauce();

    //第五步翻炒是一样的，直接在这里实现
    public void fry() {
        System.out.println("炒啊炒啊炒啊吵到熟啊");
    }
}
