package homework03.demo01;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 22:11
 * @Version 1.0
 */
public class DataTypeFilter extends DataFilter {
    public void filter() {
        System.out.println("调用数据类型转换过滤器");
        this.successor.filter();
    }
}

