package homework03.demo11;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 17:18
 * @Version 1.0
 */
public class Analyzer3 implements Analyzer {

    @Override
    public void analyze(Code code) {
        System.out.println("经分析代码总行数为：" + code.getLines());
        for (ClassExample classExample : code.getClassList()) {
            System.out.println(classExample.getName() + "类代码总行数：" + classExample.getLines());
            for (String s : classExample.getMethods().keySet()) {
                System.out.println(classExample.getName() + "类中方法" + s + "()代码总行数：" + classExample.getMethods().get(s));
            }
        }
    }
}
