package homework02.demo04;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 16:04
 * @Version 1.0
 */
public class Header extends Garnish {
    private String header;

    public Header(Table table, String header) {
        super(table);
        this.header = header;
//        System.out.println(table.content);
        content = header + " " + table.content;
    }


}
