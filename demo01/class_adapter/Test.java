package homework02.demo01.class_adapter;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 11:02
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        DBMS dbms = new DBMS();
        dbms.Encryption(new EncryptionAdapter(), "1234565");
    }
}
