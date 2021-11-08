package main.java.com.chong.responsibility;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 14:33
 * @Version 1.0
 */

//小组长类
public class GroupLeader extends Handler {

    public GroupLeader() {
        super(0, Handler.NUM_ONE);
    }

    @Override
    protected void handlderLeave(leaveResquest leaveResquest) {
        System.out.println(leaveResquest.getName() + "请假" + leaveResquest.getNum() + "天,理由是" + leaveResquest.getContent());
        System.out.println("小组长审批，审批同意");
    }
}
