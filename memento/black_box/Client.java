package main.java.com.chong.memento.black_box;


/**
 * @Author Lang wenchong
 * @Date 2021/10/31 21:17
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("------------大战boss前----------");

        GameRole gameRole = new GameRole();
        gameRole.initState();//初始化状态的操作
        gameRole.stateDisplay();
        //将游戏角色状态进行备份
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(gameRole.saveState());

        System.out.println("------------大战boss后----------------");
        //损耗严重
        gameRole.fight();
        gameRole.stateDisplay();
//        System.out.println("-------------恢复之前的状态-------------------");
        gameRole.recoverState(roleStateCaretaker.getMemento());
        System.out.println("--------------恢复之后的状态---------------------");
        gameRole.stateDisplay();
    }
}
