package homework03.demo08;

/**
 * @Author Lang wenchong
 * @Date 2021/11/4 15:41
 * @Version 1.0
 */
public class TCPServer {
    public final static OpeningState OPENING_STATE = new OpeningState();
    public final static ClosingState CLOSING_STATE = new ClosingState();
    public final static ListenngState LISTENNG_STATE = new ListenngState();

    private TCPState tcpState;

    public TCPState getTcpState() {
        return tcpState;
    }

    public void setTcpState(TCPState tcpState) {
        this.tcpState = tcpState;
        this.tcpState.setTcpServer(this);
    }

    public void open() {
        this.tcpState.open();
    }

    public void listen() {
        this.tcpState.listen();
    }

    public void close() {
        this.tcpState.close();
    }


}
