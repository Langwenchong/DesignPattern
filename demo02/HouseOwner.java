package homework03.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 22:34
 * @Version 1.0
 */
public class HouseOwner {
    private List<Command> commandList = new ArrayList<Command>();

    public void setCommandList(Command cmd) {
        commandList.add(cmd);
    }

    public void saveSettings() {
        System.out.println("分配好开关，保存配置");
        for (Command command : commandList) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
