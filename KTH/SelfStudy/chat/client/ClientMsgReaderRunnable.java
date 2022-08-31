import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

public class ClientMsgReaderRunnable implements Runnable{
    private SocketChannel channel;

    public ClientMsgReaderRunnable(SocketChannel channel) {
        this.channel = channel;
    }

    @Override
    public void run() {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        while (true) {
            try {
                int readByteCount = channel.read(buffer);
                if (readByteCount == -1) {
                    throw new Exception();
                }
                buffer.flip();
                Charset charset = Charset.forName("UTF-8");
                String data = charset.decode(buffer).toString();
                System.out.println("서버에서 받은 데이터 = [ "+data+" ]");
                buffer.clear();
            }
            catch (Exception e) {
                System.out.println(e.toString());
                break;
            }
        }
    }
}
