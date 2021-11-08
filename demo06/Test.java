package homework01.demo06;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 18:40
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("检测两个实例是否在同一个存储单元");
        VirtualAccount va1=VirtualAccount.getInstance();
        VirtualAccount va2=VirtualAccount.getInstance();
        System.out.println(va1);
        System.out.println(va2);
        System.out.println("两个单例是否在同一个存储单元？"+(va1==va2));
        System.out.println("如果上面返还是true则测试成功");
    }
}
