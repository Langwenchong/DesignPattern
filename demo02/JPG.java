package homework02.demo02;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 11:39
 * @Version 1.0
 */
public class JPG extends Image {
    public JPG(Filter filter, String name) {
        super(filter, name);
    }

    @Override
    public void beauty() {
        filter.beauty(name);
    }
}
