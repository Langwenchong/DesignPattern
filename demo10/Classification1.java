package homework03.demo10;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 16:29
 * @Version 1.0
 */
public class Classification1 extends ClassificationTemplate {

    @Override
    protected void ClassifyData() {
        Adapter adapter = new Adapter(new NaiveBayes());
        adapter.Classify();
    }
}
