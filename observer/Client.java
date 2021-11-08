package main.java.com.chong.observer;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 15:54
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //1.创建公众号对象
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        //2.订阅公众号
        subscriptionSubject.attach(new WeixinUser("孙悟空"));
        subscriptionSubject.attach(new WeixinUser("猪悟能"));
        subscriptionSubject.attach(new WeixinUser("沙悟净"));
        //3.公众号更新发送推送消息
        subscriptionSubject.notify("传至黑马的专栏更新了");
    }
}
