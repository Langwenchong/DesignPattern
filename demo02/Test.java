package homework03.demo02;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 22:41
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Setting setting1 = new Setting();
        setting1.setIndex("1");
        setting1.setRoomIndex("5");

        Setting setting2 = new Setting();
        setting2.setIndex("2");
        setting2.setRoomIndex("4");

        Setting setting3 = new Setting();
        setting3.setIndex("3");
        setting3.setRoomIndex("3");

        Setting setting4 = new Setting();
        setting4.setIndex("4");
        setting4.setRoomIndex("2");

        Setting setting5 = new Setting();
        setting5.setIndex("5");
        setting5.setRoomIndex("1");

        Remote remote = new Remote();

        SettingCommand cmd1 = new SettingCommand(remote, setting1);
        SettingCommand cmd2 = new SettingCommand(remote, setting2);
        SettingCommand cmd3 = new SettingCommand(remote, setting3);
        SettingCommand cmd4 = new SettingCommand(remote, setting4);
        SettingCommand cmd5 = new SettingCommand(remote, setting5);

        HouseOwner houseOwner = new HouseOwner();
        houseOwner.setCommandList(cmd1);
        houseOwner.setCommandList(cmd2);
        houseOwner.setCommandList(cmd3);
        houseOwner.setCommandList(cmd4);
        houseOwner.setCommandList(cmd5);

        houseOwner.saveSettings();

    }
}
