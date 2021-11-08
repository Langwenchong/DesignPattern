package main.java.com.chong.Iterator;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 16:49
 * @Version 1.0
 */
public interface StudentAggregate {
    //添加学生功能
    void addStudent(Student student);

    //删除学生功能
    void removeStudent(Student student);

    //获取迭代器对象功能
    StudentIterator getStudentIterator();
}
