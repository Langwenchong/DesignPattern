package homework03.demo04;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lang wenchong
 * @Date 2021/11/3 22:18
 * @Version 1.0
 */
public class PageAggregate implements Aggregate {
    private List<String> items = new ArrayList<String>();

    @Override
    public void addItem(String item) {
        items.add(item);
    }


    @Override
    public void removeItem(String item) {
        items.remove(item);
    }

    @Override
    public Iterator getIterator() {
        return new IteratorImpl(items);
    }

}
