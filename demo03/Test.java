package homework03.demo03;

/**
 * @Author Lang wenchong
 * @Date 2021/11/3 21:54
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        DBMS dbms1 = new DBMS("数据库1");
        DBMS dbms2 = new DBMS("数据库2");

        dbms1.addView(new View(1, "视图1"));
        dbms1.addView(new View(2, "视图2"));
        dbms1.addView(new View(3, "视图3"));

        dbms1.addStudents(new Student(1, "张三"));
        dbms1.addStudents(new Student(2, "李四"));
        dbms1.addStudents(new Student(3, "王五"));
        dbms1.addStudents(new Student(4, "赵六"));

        CopyView copyView = new CopyView();
        copyView.interpret(dbms1, dbms2);
        dbms1.printView();
        dbms2.printView();
        MoveStudents moveStudents = new MoveStudents();
        moveStudents.interpret(dbms1, dbms2);
        dbms1.printStudents();
        dbms2.printStudents();
    }
}
