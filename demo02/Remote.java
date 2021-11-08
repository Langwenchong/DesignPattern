package homework03.demo02;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 22:33
 * @Version 1.0
 */
public class Remote {
    public void update(Setting setting) {
        System.out.println("已保存配置：遥控器第" + setting.getIndex() + "个开关控制第" + setting.getRoomIndex() + "个房间");
    }
}
