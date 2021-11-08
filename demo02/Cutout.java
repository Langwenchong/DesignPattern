package homework02.demo02;

/**
 * @Author Lang wenchong
 * @Date 2021/11/1 11:36
 * @Version 1.0
 */
public class Cutout implements Filter {

    @Override
    public void beauty(String name) {
        System.out.println("使用木刻滤镜处理图片:" + name);
    }
}
