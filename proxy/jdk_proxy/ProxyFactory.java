package main.java.com.chong.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 16:25
 * @Version 1.0
 */

//获取代理对象的工厂类
public class ProxyFactory {
    //声明目标对象
    private TrainStation trainStation = new TrainStation();

    //获取代理对象的方法
    public SellTicket getProxyObject() {
        //返回代理对象
        //jdk提供的动态代理方法
        /*
        ClassLoader loader: 类加载器,用于加载代理类,可以通过目标对象获取类加载器
        Class<?>[] interfaces: 代理类实现的接口字节码对象
        InvocationHandler h :代理对象调用处理程序
         */
        SellTicket proxyObject = (SellTicket) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    /*
                    Object proxy: 代理对象，和proxyObject是同一个对象，在invoke方法中基本不用
                    Method method:对接口中的方法进行封装的method对象
                    Object[] args:调用方法的实际参数

                    返回值就是调用方法的返回值
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        System.out.println("invoke方法执行了");
                        System.out.println("代售点收取一定的服务费用(jdk)动态代理");
                        //执行目标对象的方法
                        //此时sell方法无传递至，因此args是空
                        Object obj = method.invoke(trainStation, args);
                        //由于sell方法没有返回值，因此实际上obj这里就是null
                        return obj;
                    }
                }
        );
        return proxyObject;
    }
}
