package main.java.com.chong.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 22:19
 * @Version 1.0
 */
public class Waitor {
    //持有命令对象,但是一个服务员可以发布多个命令，因此持有多个命令对象
    private List<Command> commands = new ArrayList<Command>();

    public void setCommand(Command cmd) {
        //将cmd对象存储到List中
        commands.add(cmd);
    }

    //发起命令的功能，喊订单来了
    public void orderUp() {
        System.out.println("美女服务员说：大厨，新订单来了！");
        //遍历List集合
        for (Command command : commands) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
