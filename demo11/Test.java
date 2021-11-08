package homework03.demo11;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 17:22
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ClassExample class1 = new ClassExample("A");
        class1.addVar("name");
        class1.addVar("ID");
        class1.addMethod("changeName", 24);
        class1.addMethod("changeID", 68);

        ClassExample class2 = new ClassExample("B");
        class2.addVar("sex");
        class2.addVar("age");
        class2.addVar("height");
        class2.addVar("weight");
        class2.addMethod("changeSex", 109);
        class2.addMethod("intro", 20);
        class2.addMethod("LoseWeight", 47);

        ClassExample class3 = new ClassExample("C");
        class3.addVar("size");
        class3.addMethod("getSize", 10);

        Code code = new Code();
        code.addClass(class1);
        code.addClass(class2);
        code.addClass(class3);

        code.accept(new Analyzer1());
        code.accept(new Analyzer2());
        code.accept(new Analyzer3());
    }
}
