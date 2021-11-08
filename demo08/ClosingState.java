package homework03.demo08;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 15:47
 * @Version 1.0
 */
public class ClosingState extends TCPState {

    @Override
    public void open() {
        System.out.println("TCP连接建立");
        this.tcpServer.setTcpState(TCPServer.OPENING_STATE);
    }

    @Override
    public void listen() {

    }

    @Override
    public void close() {

    }
}
