package homework01.demo01;

/**
 * @Author Lang wenchong
 * @Date 2021/10/24 16:38
 * @Version 1.0
 */
public class SimpleFactory {
    public static Shape initShape(String type) throws UnsupportedShapeException {
        Shape shape;
        if(type.equals("Circle")){
            return new Circle();
        }else if(type.equals("Triangle")){
            return new Triangle();
        }else if(type.equals("Rectangle")){
            return new Rectangle();
        }else{
            throw new UnsupportedShapeException();
        }
    }
}
