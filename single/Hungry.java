package main.java.com.chong.single;

/**
 * @Author Lang wenchong
 * @Date 2021/10/21 17:49
 * @Version 1.0
 */

//饿汉式单例
public class Hungry {
    //假设他有以下成员数组变量
    private byte[] arr1 = new byte[1024 * 1024];
    private byte[] arr2 = new byte[1024 * 1024];
    private byte[] arr3 = new byte[1024 * 1024];
    private byte[] arr4 = new byte[1024 * 1024];

    //构造器为私有，只能自己创建保证了全局只有一个实例即单例
    private Hungry() {

    }

    private final static Hungry h = new Hungry();

    //一个对外公开的接口提供单例的调用
    public static Hungry getInstance() {
        return h;
    }
}
