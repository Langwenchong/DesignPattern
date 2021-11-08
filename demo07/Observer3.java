package homework03.demo07;

import java.util.*;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 12:41
 * @Version 1.0
 */
public class Observer3 implements Observer {
    //降序排序
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValueDescending(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                int compare = (o1.getValue()).compareTo(o2.getValue());
                return -compare;
            }
        });

        Map<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    @Override
    public void handler(String msg) {
        Map<String, Integer> map = new TreeMap<String, Integer>();
        String[] words = msg.split(" ");
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        map = sortByValueDescending(map);
        System.out.println("降序打印单词出现的频率：");
        for (String s : map.keySet()) {
            System.out.println(s + " " + map.get(s));
        }
    }
}
