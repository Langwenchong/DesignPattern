package homework03.demo06;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 9:47
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Note note = new Note();
        note.setMsg("翀翀好帅");
        Application application = new Application(note);
        APPStateCaretaker appStateCaretaker = new APPStateCaretaker();
        appStateCaretaker.saveMemento(application.saveState());
        application.getNote().setMsg("翀翀好萌");
        appStateCaretaker.saveMemento(application.saveState());
        application.getNote().setMsg("翀翀好丑");
        application.recoverState(appStateCaretaker.getBack());
        System.out.println(application.getNote().getMsg());
        application.recoverState(appStateCaretaker.getBack());
        System.out.println(application.getNote().getMsg());
        application.recoverState(appStateCaretaker.getFront());
        System.out.println(application.getNote().getMsg());
        application.recoverState(appStateCaretaker.getFront());
        System.out.println(application.getNote().getMsg());
    }
}

