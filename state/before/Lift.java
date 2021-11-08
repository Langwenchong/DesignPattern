package main.java.com.chong.state.before;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 14:52
 * @Version 1.0
 */

//电梯具体的实现类
public class Lift implements ILift {

    //声明一个记录当前状态的变量
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("电梯打开了");
                setState(OPENING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("电梯打开了");
                setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                break;
        }
    }

    @Override
    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                System.out.println("电梯关闭了");
                setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                break;
            case STOPPING_STATE:
                System.out.println("电梯关闭了");
                setState(CLOSING_STATE);
                break;
            case RUNNING_STATE:
                break;
        }
    }

    @Override
    public void run() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("电梯开始运行");
                setState(RUNNING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("电梯开始运行了");
                setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                break;
        }
    }

    @Override
    public void stop() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("电梯停止了");
                setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                break;
            case RUNNING_STATE:
                System.out.println("电梯停止了");
                setState(STOPPING_STATE);
                break;
        }
    }
}
