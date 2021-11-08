package homework03.demo08;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 15:46
 * @Version 1.0
 */
public class ListenngState extends TCPState{

    @Override
    public void open() {

    }

    @Override
    public void listen() {

    }

    @Override
    public void close() {
        System.out.println("TCP连接断开");
        this.tcpServer.setTcpState(TCPServer.CLOSING_STATE);
    }
}
