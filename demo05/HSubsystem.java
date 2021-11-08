package homework03.demo05;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 8:48
 * @Version 1.0
 */
public class HSubsystem extends SubSystem{

    public HSubsystem(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void getMessage(String msg) {
        System.out.println("宾馆子系统" + name + "获取的信息是:" + msg);
    }
}
