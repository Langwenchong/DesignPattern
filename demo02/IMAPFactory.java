package homework01.demo02;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 17:01
 * @Version 1.0
 */
public class IMAPFactory{

    public Connection getConnection() {
        return new IMAPConnection();
    }
}
