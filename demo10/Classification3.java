package homework03.demo10;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 16:31
 * @Version 1.0
 */
public class Classification3 extends ClassificationTemplate {

    @Override
    protected void ClassifyData() {
        Adapter adapter = new Adapter(new KNN());
        adapter.Classify();
    }
}
