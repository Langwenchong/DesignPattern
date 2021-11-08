package main.java.com.chong.interpreter;

/**
 * @Author Lang wenchong
 * @Date 2021/10/31 17:32
 * @Version 1.0
 */
public class Minus extends AbstractExpression {
    //减号两边的表达式
    private AbstractExpression left;
    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        //将左边表达式的结果和右边表达式的结果进行相减
        return left.interpret(context) - right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "-" + right.toString() + ")";
    }
}
