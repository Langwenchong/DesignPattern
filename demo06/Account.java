package homework02.demo06;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 16:55
 * @Version 1.0
 */
public abstract class Account {
    public abstract String getPermission();

    public void display(String name) {
        System.out.println(name + "用户的权限是：" + getPermission());
    }
}
