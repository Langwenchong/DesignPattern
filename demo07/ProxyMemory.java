package homework02.demo07;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 18:32
 * @Version 1.0
 */
public class ProxyMemory {
    private Memory memory;
    private List<String> list = new ArrayList<>();

    public void add(String item) {
        list.add(item);
    }

    public ProxyMemory(Memory memory) {
        this.memory = memory;
    }

    public void getItem(String item) {
        if (list.contains(item)) {
            System.out.println("从缓冲代理内存中获取到" + item);
        } else {
            memory.getItem(item);
            list.add(item);
        }
    }
}
