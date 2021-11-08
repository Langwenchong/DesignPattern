package main.java.com.chong.bridge;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 17:47
 * @Version 1.0
 */

//avi视频文件，具体的实现化角色
public class AviFile implements VideoFile {

    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件：" + fileName);
    }
}
