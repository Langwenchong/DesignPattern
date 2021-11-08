package homework02.demo02;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 11:38
 * @Version 1.0
 */
public class Blur implements Filter{
    @Override
    public void beauty(String name) {
        System.out.println("使用模糊滤镜处理图片:" + name);
    }
}
