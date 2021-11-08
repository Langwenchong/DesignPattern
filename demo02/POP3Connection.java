package homework01.demo02;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 16:58
 * @Version 1.0
 */
public class POP3Connection implements Connection{
    @Override
    public void connect() {
        System.out.println("使用POP3连接成功");
    }
}
