package homework03.demo07;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 12:31
 * @Version 1.0
 */
public class Application {
    private List<Observer> list = new ArrayList<Observer>();

    public void attach(Observer observer) {
        list.add(observer);
    }

    public void detach(Observer observer) {
        list.remove(observer);
    }

    public void handler(String msg) {
        for (Observer observer : list) {
            observer.handler(msg);
        }
    }
}
