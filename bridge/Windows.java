package main.java.com.chong.bridge;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 17:52
 * @Version 1.0
 */

//扩展抽象化角色
public class Windows extends OperatingSystem {
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
