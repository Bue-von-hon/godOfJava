import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        try {
            SocketChannel channel = SocketChannel.open();
            channel.socket().connect(new InetSocketAddress("localhost", 1234));
            System.out.println("접속 성공");
            ClientMsgReaderRunnable r = new ClientMsgReaderRunnable(channel);
            ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
            executorService.submit(r);
            while (true) {
                ByteBuffer buffer = ByteBuffer.allocate(1024);
                Scanner sc = new Scanner(System.in);
                String data = sc.nextLine();
                if ("q".equals(data)) {
                    break;
                }
                Charset charset = Charset.forName("UTF-8");
                buffer = charset.encode(data);
                channel.write(buffer);
                System.out.println("전송 데이터 : "+data);
            }
            executorService.shutdown();
            channel.close();
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
