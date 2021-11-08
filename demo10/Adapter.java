package homework03.demo10;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 16:35
 * @Version 1.0
 */
public class Adapter {
    private ClassificationAlgorithm classificationAlgorithm;

    public Adapter(ClassificationAlgorithm classificationAlgorithm) {
        this.classificationAlgorithm = classificationAlgorithm;
    }

    public void Classify() {
        classificationAlgorithm.Classify();
    }
}
