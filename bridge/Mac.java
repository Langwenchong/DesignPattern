package main.java.com.chong.bridge;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 17:53
 * @Version 1.0
 */


public class Mac extends OperatingSystem {
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
