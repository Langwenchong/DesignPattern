package main.java.com.chong.Iterator;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 16:51
 * @Version 1.0
 */
public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> studentList = new ArrayList<Student>();

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        studentList.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(studentList);
    }
}
