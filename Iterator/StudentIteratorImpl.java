package main.java.com.chong.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 16:46
 * @Version 1.0
 */

//具体的迭代器角色类
public class StudentIteratorImpl implements StudentIterator {


    private List<Student> studentList;
    //用来记录遍历时的位置
    private int position;

    public StudentIteratorImpl(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return position < studentList.size();
    }

    @Override
    public Student next() {
        Student student = studentList.get(position);
        position++;
        return student;
    }
}
