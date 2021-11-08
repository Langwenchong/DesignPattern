package homework03.demo07;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 12:33
 * @Version 1.0
 */
public class Observer1 implements Observer {
    @Override
    public void handler(String msg) {
        String[] words = msg.split(" ");
        System.out.println("单词总数：" + words.length);
        int sum = 0;
        for (String word : words) {
            sum += word.length();
        }
        System.out.println("字符总数：" + sum);
    }
}
