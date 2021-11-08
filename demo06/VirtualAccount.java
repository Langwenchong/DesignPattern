package homework01.demo06;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 18:38
 * @Version 1.0
 */
public class VirtualAccount {
    private VirtualAccount() {
    }

    private final static VirtualAccount va = new VirtualAccount();
    //使用双重锁金策时需要使用如下的va初始化目的是为了禁用指令重排以防出现bug
    //就是加了一个volatile关键字禁止初始化的指令重排
    //private final volatile static VirtualAccount va = new VirtualAccount();

    public static VirtualAccount getInstance() {
        return va;
    }

    //下面是双重锁检测模式

//    public static VirtualAccount getInstance() {
//        if (va == null) {
//            synchronized (VirtualAccount.class) {
//                if (va == null) {
//                    va = new VirtualAccount();
//                }
//            }
//        }
//
//        return va;
//    }

}
