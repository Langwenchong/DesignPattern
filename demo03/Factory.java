package homework01.demo03;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 17:11
 * @Version 1.0
 */
public interface Factory {
    Connection createConnection();
    Statement createStatement();
}
