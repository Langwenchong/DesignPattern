package homework03.demo01;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 22:10
 * @Version 1.0
 */
public abstract class DataFilter {
    protected DataFilter successor;

    public void setSuccessor(DataFilter successor) {
        this.successor = successor;
    }

    public abstract void filter();

}
