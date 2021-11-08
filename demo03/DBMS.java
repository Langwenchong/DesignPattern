package homework03.demo03;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lang wenchong
 * @Date 2021/11/3 21:23
 * @Version 1.0
 */
public class DBMS {
    private String name;

    public String getName() {
        return name;
    }

    public DBMS(String name) {
        this.name = name;
    }

    public List<View> viewList = new ArrayList<View>();
    public List<Student> studentList = new ArrayList<Student>();

    public void addView(View v) {
        viewList.add(v);
    }

    public void addStudents(Student s) {
        studentList.add(s);
    }

    public void removeView(View v) {
        viewList.remove(v);
    }

    public void removeStudents(Student s) {
        studentList.remove(s);
    }

    public void printView() {
        for (View view : viewList) {
            System.out.print(view.getName() + " ");

        }
        System.out.print("\n");
    }

    public void printStudents() {
        for (Student student : studentList) {
            System.out.print(student.getName() + " ");
        }
        System.out.print("\n");
    }
}
