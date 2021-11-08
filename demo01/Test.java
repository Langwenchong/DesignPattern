package homework01.demo01;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 16:37
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("初始化一个工厂");
        try {
            System.out.println("尝试创建圆形");
            Shape shape=SimpleFactory.initShape("Circle");
            shape.init();
            System.out.println("尝试创建三角形");
            shape=SimpleFactory.initShape("Rectangle");
            shape.init();
            System.out.println("尝试创建长方形");
            shape=SimpleFactory.initShape("Triangle");
            shape.init();
            System.out.println("尝试创建椭圆形");
            shape=SimpleFactory.initShape("椭圆");
            shape.init();
        } catch (Exception | UnsupportedShapeException e) {
            System.out.println("创建图形异常！");
        }
    }
}
