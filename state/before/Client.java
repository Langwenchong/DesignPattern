package main.java.com.chong.state.before;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 15:00
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.setState(ILift.OPENING_STATE);
        lift.open();
        lift.run();
        lift.close();
        lift.run();
        lift.close();
        lift.stop();
    }
}
