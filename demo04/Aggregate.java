package homework03.demo04;

/**
 * @Author Lang wenchong
 * @Date 2021/11/3 22:17
 * @Version 1.0
 */
public interface Aggregate {
    void addItem(String item);

    void removeItem(String item);

    Iterator getIterator();
}
