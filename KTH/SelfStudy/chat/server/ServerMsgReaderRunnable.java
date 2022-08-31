import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;

public class ServerMsgReaderRunnable implements Runnable{
    private SocketChannel channel;

    public ServerMsgReaderRunnable(SocketChannel channel) {
        this.channel = channel;
    }
    @Override
    public void run() {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        try {
            while (true) {
                int readByteCount = channel.read(buffer);
                if (readByteCount == -1) throw new Exception();
                buffer.flip();
                String data = "";
                Charset charset = Charset.forName("UTF-8");
                data = charset.decode(buffer).toString();
                for (SocketChannel sc : Server.clients) {
                    if (sc.equals(this.channel)) continue;
                    buffer.flip();
                    sc.write(buffer);
                }
                buffer.clear();
                System.out.println("data = [ "+data+" ] served by "+Thread.currentThread().getId()+" Thread");
            }
        }
        catch (Exception e) {
            for (SocketChannel sc : Server.clients) {
                if (!sc.equals(this.channel)) continue;
                Server.clients.remove(this.channel);
            }
            System.out.println(e.toString()+"으로 인한 클라이언트 연결 종료");
            System.out.println("클라이언트의 수는 "+Server.clients.size());
            try {
                channel.close();
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }
        }
    }
}
