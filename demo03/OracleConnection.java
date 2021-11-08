package homework01.demo03;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 17:13
 * @Version 1.0
 */
public class OracleConnection implements  Connection{
    @Override
    public void connect() {
        System.out.println("Oracle连接成功");
    }
}
