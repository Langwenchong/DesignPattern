package homework03.demo06;

import java.util.Stack;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 9:38
 * @Version 1.0
 */
public class APPStateCaretaker {
    private Stack<Memento> front = new Stack<>();
    private Stack<Memento> back = new Stack<>();

    public Memento getFront() {
        Memento memento = front.pop();
        back.push(memento);
        return memento;
    }

    public Memento getBack() {
        Memento memento = back.pop();
        front.push(memento);
        return memento;
    }

    public void saveMemento(Memento memento) {
        back.push(memento);
//        System.out.println(memento);
    }
}
