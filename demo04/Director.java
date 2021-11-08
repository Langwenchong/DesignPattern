package homework01.demo04;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 17:28
 * @Version 1.0
 */
public class Director {
    public Car build(String type) {
        Builder b = new Worker();
        b.createName(type);
        b.createEngine(type);
        b.createTire(type);
        b.createBody(type);
        return b.getCar();
    }
}
