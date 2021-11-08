package homework02.demo04;

import javafx.scene.control.Tab;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 16:11
 * @Version 1.0
 */
public abstract class Garnish extends Table {
    private Table table;

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Garnish(Table table) {
        this.table = table;
    }

}
