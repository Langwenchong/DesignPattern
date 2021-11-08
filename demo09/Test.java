package homework03.demo09;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 16:14
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Cloud cloud = new Cloud(new PreCopy());
        cloud.Copy();

        System.out.println("==================");
        cloud.setCopy(new PostCopy());
        cloud.Copy();

        System.out.println("==================");
        cloud.setCopy(new MotionCopy());
        cloud.Copy();
    }
}
