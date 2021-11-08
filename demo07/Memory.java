package homework02.demo07;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 18:28
 * @Version 1.0
 */
public class Memory {
    public Memory(List list) {
        this.list = list;
    }

    private List<String> list = new ArrayList<>();


    public void getItem(String item) {
        if (list.contains(item)) {
            System.out.println("从内存中获取到" + item);
        }
    }
}
