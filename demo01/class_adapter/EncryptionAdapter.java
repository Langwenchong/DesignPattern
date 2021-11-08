package homework02.demo01.class_adapter;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 10:59
 * @Version 1.0
 */
public class EncryptionAdapter extends ThirdPartEncryptionImpl implements Encryption {
    @Override
    public void execute(String pwd) {
        System.out.println("使用适配器进行加密密码：" + pwd);
        doEncryption(pwd);
    }
}
