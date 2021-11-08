package homework03.demo08;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 15:44
 * @Version 1.0
 */
public class OpeningState extends TCPState {


    @Override
    public void open() {
        System.out.println("TCP连接建立");
    }

    @Override
    public void listen() {
        System.out.println("TCP连接开始监听");
        this.tcpServer.setTcpState(TCPServer.LISTENNG_STATE);
    }

    @Override
    public void close() {
        System.out.println("TCP连接断开");
        this.tcpServer.setTcpState(TCPServer.CLOSING_STATE);
    }
}
