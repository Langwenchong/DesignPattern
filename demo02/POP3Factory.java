package homework01.demo02;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 17:00
 * @Version 1.0
 */
public class POP3Factory {
    public Connection getConnection() {
        return new POP3Connection();
    }
}
