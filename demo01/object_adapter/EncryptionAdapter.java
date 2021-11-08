package homework02.demo01.object_adapter;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 10:59
 * @Version 1.0
 */
public class EncryptionAdapter implements Encryption {
    ThirdPartEncryptionImpl thirdPartEncryption;

    public EncryptionAdapter(ThirdPartEncryptionImpl thirdPartEncryption) {
        this.thirdPartEncryption = thirdPartEncryption;
    }

    @Override
    public void execute(String pwd) {
        System.out.println("使用适配器进行加密密码：" + pwd);
        thirdPartEncryption.doEncryption(pwd);
    }
}
