package homework01.demo03;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 17:15
 * @Version 1.0
 */
public class MysqlStatement implements  Statement{
    @Override
    public void operate() {
        System.out.println("执行Mysql语句");
    }
}
