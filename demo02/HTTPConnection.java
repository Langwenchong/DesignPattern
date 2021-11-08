package homework01.demo02;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 17:00
 * @Version 1.0
 */
public class HTTPConnection implements Connection{

    @Override
    public void connect() {
        System.out.println("使用HTTP连接成功");
    }
}
