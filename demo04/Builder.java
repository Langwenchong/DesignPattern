package homework01.demo04;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 17:28
 * @Version 1.0
 */
public interface Builder {
    void createName(String name);
    void createEngine(String engine);
    void createTire(String tire);
    void createBody(String body);
    Car getCar();
}
