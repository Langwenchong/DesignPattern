package homework03.demo03;

/**
 * @Author Lang wenchong
 * @Date 2021/11/3 21:52
 * @Version 1.0
 */
public class MoveStudents implements Operation {

    @Override
    public void interpret(DBMS srcDB, DBMS desDB) {
        for (Student student : srcDB.studentList) {
            desDB.addStudents(student);
        }
        srcDB.studentList.clear();
        System.out.println("将" + srcDB.getName() + "中的学生表移动到了" + desDB.getName());
    }
}
