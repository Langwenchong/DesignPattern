package main.java.com.chong.bridge;

/**
 * @Author Lang wenchong
 * @Date 2021/10/30 17:54
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建mac系统对象
        OperatingSystem system = new Mac(new AviFile());
        //开始使用操作系统播放视频文件
        system.play("战狼3");
    }
}
