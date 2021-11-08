package homework03.demo05;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 8:41
 * @Version 1.0
 */
public abstract class SubSystem {
    protected String name;
    protected Mediator mediator;

    public SubSystem(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void contact(String msg) {
        mediator.contact(msg, this);
    }

    public abstract void getMessage(String msg);
}
