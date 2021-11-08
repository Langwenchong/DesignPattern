package homework01.demo04;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 17:32
 * @Version 1.0
 */
public class Worker implements Builder {

    private Car car;

    public Worker() {
        car = new Car();
    }

    @Override
    public void createName(String name) {
        car.setName(name);
    }

    @Override
    public void createEngine(String engine) {
        car.setEngine(engine + "的发动机");
    }

    @Override
    public void createTire(String tire) {
        car.setTire(tire + "的轮胎");
    }

    @Override
    public void createBody(String body) {
        car.setBody(body + "的车身");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
