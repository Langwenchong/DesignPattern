package homework03.demo03;

/**
 * @Author Lang wenchong
 * @Date 2021/11/3 21:42
 * @Version 1.0
 */
public class Student {
    private String name;
    private int ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Student(int ID, String name) {
        this.name = name;
        this.ID = ID;
    }
}
