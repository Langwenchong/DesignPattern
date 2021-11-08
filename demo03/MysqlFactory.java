package homework01.demo03;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 17:17
 * @Version 1.0
 */
public class MysqlFactory implements Factory {
    @Override
    public Connection createConnection() {
        return new MysqlConnection();
    }

    @Override
    public Statement createStatement() {
        return new MysqlStatement();
    }
}
