package homework02.demo05;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 16:49
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {

        Phone phone = new Phone(new Account(), new Message(), new Image());
        phone.save();
    }
}
