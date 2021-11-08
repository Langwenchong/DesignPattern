package main.java.com.chong.bridge;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 17:50
 * @Version 1.0
 */

//抽象的操作系统类，抽象化角色
public abstract class OperatingSystem {
    //声明VideoFile变量
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
