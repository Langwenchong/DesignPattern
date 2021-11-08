package main.java.com.chong.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 22:10
 * @Version 1.0
 */
public class Order {
    //下订单的餐桌号码
    private int diningTable;
    //所下的菜品及份数
    private Map<String, Integer> foodDir = new HashMap<String, Integer>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }


    public void setFood(String name, int num) {
        foodDir.put(name, num);
    }
}
