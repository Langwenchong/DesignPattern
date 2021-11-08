package main.java.com.chong.state.after;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 15:14
 * @Version 1.0
 */
public class RunningState extends LiftState {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯开始运行");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
