package homework03.demo08;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 15:41
 * @Version 1.0
 */
public abstract class TCPState {
    protected TCPServer tcpServer;

    public void setTcpServer(TCPServer tcpServer) {
        this.tcpServer = tcpServer;
    }

    //TCP建立
    public abstract void open();

    //TCP监听
    public abstract void listen();

    //TCP关闭
    public abstract void close();
}
