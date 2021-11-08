package main.java.com.chong.responsibility;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 14:25
 * @Version 1.0
 */
public abstract class Handler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    //该领导处理的请假天数区间
    private int numStart;
    private int numEnd;

    //声明后继者（声明上级领导）
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    //设置上级领导对象
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //各级领导处理请假条的方法
    protected abstract void handlderLeave(leaveResquest leaveResquest);

    //提交请假条
    public final void submit(leaveResquest leaveResquest) {
        //领导先进性审批是否通过
        if (this.nextHandler != null && leaveResquest.getNum() > this.numEnd) {
            //提交给上级领导进行审批
            System.out.println("提交至上级审核");
            this.nextHandler.submit(leaveResquest);
        } else {
            this.handlderLeave(leaveResquest);
            System.out.println("流程结束！");
        }
    }
}
