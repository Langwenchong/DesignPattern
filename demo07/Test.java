package homework03.demo07;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 12:52
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Application application = new Application();
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();
        Observer observer3 = new Observer3();
        application.attach(observer1);
        application.attach(observer2);
        application.attach(observer3);
        application.handler("Hello world ! Hello Langwenchong ! I am your computer ……");
    }
}
