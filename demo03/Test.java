package homework01.demo03;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 17:17
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("尝试测试Oracle数据库");
        Factory f=new OracleFactory();
        Connection c=f.createConnection();
        c.connect();
        Statement s=f.createStatement();
        s.operate();
        System.out.println("尝试测试Mysql数据库");
        f=new MysqlFactory();
        c=f.createConnection();
        c.connect();
        s=f.createStatement();
        s.operate();
    }
}
