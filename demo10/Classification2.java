package homework03.demo10;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 16:30
 * @Version 1.0
 */
public class Classification2 extends ClassificationTemplate {

    @Override
    protected void ClassifyData() {
        Adapter adapter = new Adapter(new DecisionTree());
        adapter.Classify();
    }
}
