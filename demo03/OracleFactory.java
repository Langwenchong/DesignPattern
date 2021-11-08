package homework01.demo03;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 17:16
 * @Version 1.0
 */
public class OracleFactory implements Factory {
    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }

    @Override
    public Statement createStatement() {
        return new OracleStatement();
    }
}
