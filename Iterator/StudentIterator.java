package main.java.com.chong.Iterator;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 16:45
 * @Version 1.0
 */

//抽象迭代器角色接口
public interface StudentIterator {
    //判断是够还有元素
    boolean hasNext();
    //获取下一个元素

    Student next();
}
