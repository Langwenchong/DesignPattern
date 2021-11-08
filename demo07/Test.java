package homework02.demo07;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 18:36
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("元素1");
        list.add("元素2");
        list.add("元素3");
        Memory memory = new Memory(list);
        ProxyMemory proxyMemoey = new ProxyMemory(memory);
        proxyMemoey.getItem("元素1");
        proxyMemoey.getItem("元素2");
        proxyMemoey.getItem("元素1");
    }

}
