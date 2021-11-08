package main.java.com.chong.Iterator;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 16:56
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建聚合对象
        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();
        //添加元素
        studentAggregate.addStudent(new Student("张三", "001"));
        studentAggregate.addStudent(new Student("李四", "002"));
        studentAggregate.addStudent(new Student("王五", "003"));
        studentAggregate.addStudent(new Student("赵六", "004"));
        //1.获取迭代器对象
        StudentIterator studentIterator = studentAggregate.getStudentIterator();
        //2.遍历
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next().toString());
        }
    }
}
