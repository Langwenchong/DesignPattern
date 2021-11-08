package main.java.com.chong.prototype.demo02;

import java.util.Date;

/**
 * @Author Lang wenchong
 * @Date 2021/10/22 20:34
 * @Version 1.0
 */

//1.实现克隆接口
//2.重写一个方法即可完成克隆
public class Video implements Cloneable {
    //1.实现Cloneable接口
    private String name;
    private Date createTime;

    //2.重写这个方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
        //重写克隆方法
        Object obj = super.clone();
        Video v = (Video) obj;
        //将对象的属性也全部重新克隆一遍
        v.createTime = (Date) this.createTime.clone();
        //这里最终返回v或者obj都是可以的
        return obj;
        //return v
    }

    public Video() {

    }

    public Video(String name, Date date) {
        this.name = name;
        this.createTime = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }


}
