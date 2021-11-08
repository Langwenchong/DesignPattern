package main.java.com.chong.prototype.demo01;

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
        //但是此时有浅拷贝的情况，即v2和v1的date指向同一个位置
        //造成v2修改时间后v1的时间也会发生变化，这就是浅拷贝
        date.setTime(22131231);
        v2.setCreateTime(date);
        //此时v1和v2大的时间会保持一致，即v1的时间自动发生了变化和v2保持一致
        System.out.println(v2.getCreateTime().equals(v1.getCreateTime()));

    }

}
