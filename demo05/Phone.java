package homework02.demo05;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 16:46
 * @Version 1.0
 */
public class Phone {
    private Account account;
    private Message message;
    private Image image;

    public Phone(Account account, Message message, Image image) {
        this.account = account;
        this.message = message;
        this.image = image;
    }

    public void save() {
        System.out.println("手机备份");
        account.save();
        message.save();
        image.save();
    }
}
