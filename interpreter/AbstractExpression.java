package main.java.com.chong.interpreter;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 17:23
 * @Version 1.0
 */

//抽象表达式类
public abstract class AbstractExpression {
    public abstract int interpret(Context context);
}
