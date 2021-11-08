package main.java.com.chong.responsibility;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 14:38
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建请假条
        leaveResquest leaveResquest = new leaveResquest("小明", 6, "身体不适");
        //创建各级领导对象
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();
        //设置处理链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);
        //提交请假条
        groupLeader.submit(leaveResquest);
    }
}
