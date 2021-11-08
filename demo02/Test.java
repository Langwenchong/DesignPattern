package homework02.demo02;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 11:41
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        JPG jpg = new JPG(new Sharpen(), "风景.jpg");
        jpg.beauty();
        PNG png = new PNG(new Texture(), "美女.png");
        png.beauty();
        GIF gif = new GIF(new Blur(), "好吃的.gif");
        gif.beauty();
    }
}
