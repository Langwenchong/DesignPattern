package homework01.demo04;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 17:31
 * @Version 1.0
 */
public class Car {
    private String name="婴儿车";
    private String engine="婴儿车的发动机";
    private String tire="婴儿车的轮胎";
    private String body="婴儿车的车身";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", tire='" + tire + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
