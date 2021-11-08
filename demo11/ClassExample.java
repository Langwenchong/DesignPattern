package homework03.demo11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 16:59
 * @Version 1.0
 */
public class ClassExample {
    private String name;
    //自动计算行数
    private int lines;
    private List<String> vars = new ArrayList<String>();
    private Map<String, Integer> methods = new HashMap<String, Integer>();

    public ClassExample(String name) {
        this.name = name;
        this.lines = 0;
    }

    //变量声明单独占一行
    public void addVar(String var) {
        vars.add(var);
        lines += 1;
    }

    //方法行数直接给出
    public void addMethod(String method, int lines) {
        methods.put(method, lines);
        this.lines += lines;
    }

    public String getName() {
        return name;
    }

    public int getLines() {
        return lines;
    }

    public List<String> getVars() {
        return vars;
    }

    public Map<String, Integer> getMethods() {
        return methods;
    }
}
