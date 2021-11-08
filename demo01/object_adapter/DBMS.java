package homework02.demo01.object_adapter;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 10:51
 * @Version 1.0
 */
public class DBMS {
    public void Encryption(Encryption encryption, String pwd) {
        encryption.execute(pwd);
    }
}
