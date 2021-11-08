package homework03.demo04;

/**
 * @Author Lang wenchong
 * @Date 2021/11/3 22:24
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Aggregate aggregate = new PageAggregate();
        aggregate.addItem("元素1");
        aggregate.addItem("元素2");
        aggregate.addItem("元素3");
        aggregate.addItem("元素4");

        Iterator iterator = aggregate.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
