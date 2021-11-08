package main.java.com.chong.bridge;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 17:49
 * @Version 1.0
 */

//rmvb视频文件类，具体实现化角色
public class RmvbFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb视频文件：" + fileName);
    }
}
