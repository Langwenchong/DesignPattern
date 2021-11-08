package homework02.demo06;

import java.util.HashMap;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 16:57
 * @Version 1.0
 */
public class AccountFactory {
    public HashMap<String, Account> map;

    private AccountFactory() {
        map = new HashMap<String, Account>();
        map.put("01", new Normal());
        map.put("02", new VIP());
        map.put("03", new VIPP());
    }

    private static AccountFactory accountFactory = new AccountFactory();

    public static AccountFactory getInstance() {
        return accountFactory;
    }

    public Account getPermission(String code) {
        return map.get(code);
    }
}
