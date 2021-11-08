package main.java.com.chong.prototype.demo02;

import java.util.Date;

/**
 * @Author Lang wenchong
 * @Date 2021/10/22 20:37
 * @Version 1.0
 */

//客户端：实现克隆
public class Bilibili {
    public static void main(String[] args) throws CloneNotSupportedException {
        //原型对象
        Date date = new Date();
        Video v1 = new Video("狂神说java", date);
        System.out.println("v1=>" + v1);
        System.out.println("v1=>hash" + v1.hashCode());

        //克隆v1
        Video v2 = (Video) v1.clone();
        //此时v2和v1内容会完全一致，并且存储到了不同的内存空间
        //发现此时HashCode确实不同，说明存储的内存空间不同
        //此时更改v2的名字确实不会改变v1的名字
        v2.setName("Clone:狂神说java");
        //更改为了深拷贝，因此此时更改v2的日期，v1的日期不会发生改变
        date.setTime(22131231);
        v2.setCreateTime(date);
        //因此此时下面为false
        System.out.println(v2.getCreateTime().equals(v1.getCreateTime()));

    }

}
