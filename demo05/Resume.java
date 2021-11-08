package homework01.demo05;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 17:44
 * @Version 1.0
 */
public class Resume implements Cloneable {
    private String name="wenchong";
    private Picture pic=new Picture();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Picture getPic() {
        return pic;
    }

    public void setPic(Picture pic) {
        this.pic = pic;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepClone() throws CloneNotSupportedException {
        Object obj = null;
        Resume r = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        r = (Resume) obj;
        r.setPic((Picture)getPic().clone());
        return r;
    }
}
