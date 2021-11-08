package homework02.demo01.class_adapter;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 10:48
 * @Version 1.0
 */
public class ThirdPartEncryptionImpl implements ThiredPartEncryption {

    @Override
    public void doEncryption(String pwd) {
        System.out.println("使用旧加密算法加密密码："+pwd);
    }
}
