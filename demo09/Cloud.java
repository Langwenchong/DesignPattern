package homework03.demo09;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 16:10
 * @Version 1.0
 */
public class Cloud {
    private CopyInterface copy;

    public Cloud(CopyInterface copy) {
        this.copy = copy;
    }

    public void setCopy(CopyInterface copy) {
        this.copy = copy;
    }

    public void Copy() {
        copy.Copy();
    }
}
