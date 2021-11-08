package homework01.demo04;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 17:36
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Director d = new Director();
        System.out.println("尝试创建方程式赛车");
        Car c = d.build("方程式赛车");
        System.out.println(c.toString());
        System.out.println("尝试创建运动汽车");
        c = d.build("运动汽车");
        System.out.println(c.toString());
        System.out.println("尝试创建卡车");
        c = d.build("卡车");
        System.out.println(c.toString());
    }
}
