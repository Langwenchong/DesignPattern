package main.java.com.chong.interpreter;

import java.util.Calendar;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 17:37
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建环境对象
        Context context = new Context();
        //给环境对象存储变量
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);
        //获取抽象语法树
        AbstractExpression abstractExpression = new Minus(a, new Plus(b, new Minus(c, d)));
        int result = abstractExpression.interpret(context);
        System.out.println(abstractExpression + "=" + result);
    }
}
