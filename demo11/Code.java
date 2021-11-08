package homework03.demo11;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 16:57
 * @Version 1.0
 */
public class Code {
    private int lines;
    private List<ClassExample> classList = new ArrayList<ClassExample>();

    public int getLines() {
        return lines;
    }

    public List<ClassExample> getClassList() {
        return classList;
    }

    public void addClass(ClassExample classExample) {
        classList.add(classExample);
        lines += classExample.getLines();
    }

    public void accept(Analyzer analyzer) {
        analyzer.analyze(this);
    }
}
