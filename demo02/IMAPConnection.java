package homework01.demo02;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 16:59
 * @Version 1.0
 */
public class IMAPConnection implements  Connection{
    @Override
    public void connect() {
        System.out.println("使用IMAP连接成功");
    }
}
