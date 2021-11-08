package homework01.demo03;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 17:14
 * @Version 1.0
 */
public class MysqlConnection implements  Connection{
    @Override
    public void connect() {
        System.out.println("Mysql连接成功");
    }
}
