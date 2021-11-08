package main.java.com.chong.responsibility;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 14:37
 * @Version 1.0
 */
public class GeneralManager extends Handler {
    public GeneralManager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handlderLeave(leaveResquest leaveResquest) {
        System.out.println(leaveResquest.getName() + "请假" + leaveResquest.getNum() + "天,理由是" + leaveResquest.getContent());
        System.out.println("总经理审批，审批同意");
    }
}
