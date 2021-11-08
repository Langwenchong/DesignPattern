package main.java.com.chong.memento.white_box;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 21:16
 * @Version 1.0
 */

//备忘录管理对象
public class RoleStateCaretaker {
    //声明RoleStateMemento类型的变量
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
