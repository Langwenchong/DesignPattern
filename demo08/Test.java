package homework03.demo08;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 15:58
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        TCPServer tcpServer = new TCPServer();
        tcpServer.setTcpState(new OpeningState());
        tcpServer.listen();
        tcpServer.open();
        tcpServer.listen();
        tcpServer.close();
        tcpServer.listen();
    }
}
