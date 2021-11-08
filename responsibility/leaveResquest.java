package main.java.com.chong.responsibility;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 14:23
 * @Version 1.0
 */

//请假条
public class leaveResquest {
    //请假人员姓名
    private String name;

    //请假天数
    private int num;
    //请假内容

    private String content;

    public leaveResquest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
