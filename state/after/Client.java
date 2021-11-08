package main.java.com.chong.state.after;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 15:31
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建环境角色对象
        Context context = new Context();
        //设置当前电梯状态
        context.setLiftState(new RunningState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
