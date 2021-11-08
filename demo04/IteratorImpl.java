package homework03.demo04;

import java.util.List;

/**
 * @Author Lang wenchong
 * @Date 2021/11/3 22:21
 * @Version 1.0
 */
public class IteratorImpl implements Iterator {

    private int position;
    private List<String> items;

    public IteratorImpl(List<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public String next() {
        String item = items.get(position);
        position++;
        return item;
    }
}
