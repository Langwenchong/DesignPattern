package homework03.demo05;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 8:50
 * @Version 1.0
 */
public class TASubsystem extends SubSystem {

    public TASubsystem(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void getMessage(String msg) {
        System.out.println("旅游景点子系统" + name + "获取的信息是:" + msg);
    }
}
