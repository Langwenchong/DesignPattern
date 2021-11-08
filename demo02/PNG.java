package homework02.demo02;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 11:40
 * @Version 1.0
 */
public class PNG extends Image {
    public PNG(Filter filter, String name) {
        super(filter, name);
    }

    @Override
    public void beauty() {
        filter.beauty(name);
    }
}
