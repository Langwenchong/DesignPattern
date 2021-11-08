package main.java.com.chong.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 17:12
 * @Version 1.0
 */
public class Home {
    //声明一个集合对象用来存储元素对象
    private List<Animal> nodeList = new ArrayList<Animal>();

    //添加元素的功能
    public void add(Animal animal) {
        nodeList.add(animal);
    }

    public void action(Person person) {
        //遍历集合，获取每一个元素对象。让访问者访问每一个元素
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }
}
