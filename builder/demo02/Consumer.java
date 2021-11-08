package main.java.com.chong.builder.demo02;

/**
 * @Author Lang wenchong
 * @Date 2021/10/22 17:18
 * @Version 1.0
 */
public class Consumer {
    public static void main(String[] args) {
        //我们自己扮演指挥者来更改套餐
        //首先需要创建一名服务员即建造者
        Worker worker = new Worker();
        //修改默认的套餐，将汉堡更改为上校鸡块
        //修改默认的套餐，可累更改为咖啡
        //最终我们从这个当前worker实例所携带的套餐实例product获取修改的套餐
        //即静态内部类的体现
        //同时这里也体现了链式变成的特点
        Product product = worker.buildA("上校鸡块").buildB("咖啡").getProduct();
        //输出套餐信息
        System.out.println(product.toString());
    }
}
