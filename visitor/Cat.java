package main.java.com.chong.visitor;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 17:06
 * @Version 1.0
 */
public class Cat implements Animal {
    @Override
    public void accept(Person person) {
        //访问者喂食宠物猫
        person.feed(this);
        System.out.println("好好吃，喵喵喵");
    }
}
