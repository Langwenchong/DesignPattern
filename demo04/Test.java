package homework02.demo04;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 16:10
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Table table = new ConcreteTable();
        table = new Header(table, "表头1");
        table.diskplay();
        table = new Header(table, "表头2");
        table.diskplay();
        table = new Footer(table, "表尾1");
        table.diskplay();
    }
}
