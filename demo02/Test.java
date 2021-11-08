package homework01.demo02;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 17:02
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("尝试使用POP3连接");
        POP3Factory  f1=new POP3Factory();
        Connection c=f1.getConnection();
        c.connect();
        System.out.println("尝试使用HTTP连接");
        HTTPFactory f2=new HTTPFactory();
        c=f2.getConnection();
        c.connect();
        System.out.println("尝试使用IMAP连接");
        IMAPFactory f3=new IMAPFactory();
        c=f3.getConnection();
        c.connect();
    }
}
