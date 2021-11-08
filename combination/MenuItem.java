package main.java.com.chong.combination;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 20:37
 * @Version 1.0
 */

//菜单项类，叶子节点角色
public class MenuItem extends MenuComponent {
    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }

}
