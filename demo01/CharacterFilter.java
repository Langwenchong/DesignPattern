package homework03.demo01;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 22:10
 * @Version 1.0
 */
public class CharacterFilter extends DataFilter {
    public void filter() {
        System.out.println("字符编码转换过滤器");
        this.successor.filter();
    }
}

