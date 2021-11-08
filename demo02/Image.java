package homework02.demo02;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 11:32
 * @Version 1.0
 */
public abstract class Image {
    protected String name;
    protected Filter filter;

    public Image(Filter filter, String name) {
        this.filter = filter;
        this.name = name;
    }

    public abstract void beauty();
}
