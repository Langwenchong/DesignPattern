package homework02.demo06;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 17:59
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        AccountFactory factory = AccountFactory.getInstance();
        Account account1 = factory.getPermission("01");
        account1.display("张三");
        Account account2 = factory.getPermission("02");
        account2.display("李四");
        Account account3 = factory.getPermission("03");
        account3.display("王五");
    }
}
