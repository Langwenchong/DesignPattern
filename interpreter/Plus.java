package main.java.com.chong.interpreter;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 17:27
 * @Version 1.0
 */

//加发表达式类
public class Plus extends AbstractExpression {
    //加号两边的表达式
    private AbstractExpression left;
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        //将左边表达式的结果和右边表达式的结果进行相加
        return left.interpret(context) + right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "+" + right.toString() + ")";
    }
}
