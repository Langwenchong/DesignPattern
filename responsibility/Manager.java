package main.java.com.chong.responsibility;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 14:36
 * @Version 1.0
 */
public class Manager extends Handler {
    public Manager() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    protected void handlderLeave(leaveResquest leaveResquest) {
        System.out.println(leaveResquest.getName() + "请假" + leaveResquest.getNum() + "天,理由是" + leaveResquest.getContent());
        System.out.println("部门经理审批，审批同意");
    }
}
