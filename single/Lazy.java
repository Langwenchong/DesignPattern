package main.java.com.chong.single;

/**
 * @Author Lang wenchong
 * @Date 2021/10/21 17:55
 * @Version 1.0
 */
//懒汉式单例模式，有名为DLC单例
public class Lazy {
    //假设他有以下成员数组变量
    private byte[] arr1 = new byte[1024 * 1024];
    private byte[] arr2 = new byte[1024 * 1024];
    private byte[] arr3 = new byte[1024 * 1024];
    private byte[] arr4 = new byte[1024 * 1024];

    private Lazy() {
        System.out.println(Thread.currentThread().getName() + "ok");
    }


    //先创建的，但是并没有初始化，因此此时l是null不占用很大的空间
    private static volatile Lazy lazy;

    public static Lazy getInstance() {
        //当外部模块调用这个单例对象时再进行初始化
        if (lazy == null) {
            synchronized (Lazy.class) {
                //双重null判断加快效率
                if (lazy == null) {
                    lazy = new Lazy();
                }
            }
        }
        return lazy;
    }


    //但是多线程情况下有问题
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                lazy.getInstance();
            }).start();
        }
    }
}
