package main.java.com.chong.flyweight;

import javax.swing.*;
import java.util.HashMap;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 21:03
 * @Version 1.0
 */

//工厂类，将该类设计为单例
public class BoxFactory {
    public HashMap<String, AbstractBox> map;

    //在构造方法中进行初始化操作
    //单例，因此工厂私有
    private BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    public static BoxFactory getInstance() {
        return boxFactory;
    }

    //饿汉式
    private static BoxFactory boxFactory = new BoxFactory();

    //根据名称获取图形对象
    public AbstractBox getShape(String name) {
        return map.get(name);
    }

}
