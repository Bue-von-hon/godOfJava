import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Server {
    static ConcurrentLinkedQueue<String> datas = new ConcurrentLinkedQueue<>();
    static ConcurrentLinkedQueue<SocketChannel> clients = new ConcurrentLinkedQueue<>();
    public static void main(String[] args) {
        System.out.println("서버 시작");
        while (true) {
            try (ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();) {
                serverSocketChannel.bind(new InetSocketAddress("localhost", 1234));;
                // 나중에 비동기로 바꾸기
                serverSocketChannel.configureBlocking(true);
                SocketChannel socketChannel = serverSocketChannel.accept();
                System.out.println("클라이언트 접속 성공");
                clients.add(socketChannel);
                ServerChannelHandler serverChannelHandler = new ServerChannelHandler(socketChannel);
                serverChannelHandler.start();
            }
            catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}
