package homework03.demo07;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 12:38
 * @Version 1.0
 */
public class Observer2 implements Observer {
    @Override
    public void handler(String msg) {
        Set<String> set = new TreeSet<String>();
        String[] words = msg.split(" ");
        for (String word : words) {
            set.add(word);
        }
        System.out.println("出现的单词：" + set);
    }
}
