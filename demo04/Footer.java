package homework02.demo04;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 16:06
 * @Version 1.0
 */
public class Footer extends Garnish {

    private String footer;

    public Footer(Table table, String footer) {
        super(table);
        this.footer = footer;
        content = table.content + " " + footer;
    }

}
