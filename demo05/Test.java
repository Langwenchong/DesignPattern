package homework01.demo05;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 18:05
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("首先演示浅克隆");
        Resume r1=new Resume();
        Resume r2= null;
        try {
            r2 = (Resume)r1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("r1和r2是否照片相同存储地址？"+(r1.getPic()==r2.getPic()));
        System.out.println("上面返还true表示且此时是浅克隆");
        System.out.println("然后演示深克隆");
        Resume r3=(Resume)r1.deepClone();
        System.out.println("r1和r3是否照片相同存储地址？"+(r1.getPic()==r3.getPic()));
        System.out.println("上面返还false说明此时是深克隆");
    }
}
