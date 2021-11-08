package main.java.com.chong.memento.black_box;

import main.java.com.chong.memento.white_box.RoleStateMemento;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 21:16
 * @Version 1.0
 */

//备忘录管理对象
public class RoleStateCaretaker {
    //声明RoleStateMemento类型的变量
    private Memento memento;

    public Memento getMomento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}
