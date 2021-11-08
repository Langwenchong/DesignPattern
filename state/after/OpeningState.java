package main.java.com.chong.state.after;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 15:13
 * @Version 1.0
 */
public class OpeningState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯开启");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        //调用当前状态中的context中的对应的close方法
        super.context.close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
