package homework03.demo02;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 22:33
 * @Version 1.0
 */
public class SettingCommand implements Command {
    private Remote remote;
    private Setting setting;

    public SettingCommand(Remote remote, Setting setting) {
        this.remote = remote;
        this.setting = setting;
    }

    @Override
    public void execute() {
        remote.update(setting);
    }
}
