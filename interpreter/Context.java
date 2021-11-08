package main.java.com.chong.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 17:24
 * @Version 1.0
 */

//环境角色类
public class Context {
    //定义一个Map集合用来存储变量及对应的值
    private Map<Variable, Integer> map = new HashMap<Variable, Integer>();

    //添加变量的功能
    public void assign(Variable variable, Integer value) {
        map.put(variable, value);
    }

    //根据变量获取对应的值的方法
    public int getValue(Variable variable) {
        return map.get(variable);

    }
}
