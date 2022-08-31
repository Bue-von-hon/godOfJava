import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerChannelHandler extends Thread{
    private SocketChannel channel;
    private ExecutorService executorService;
    public ServerChannelHandler(SocketChannel channel) {
        this.channel = channel;
    }

    @Override
    public void run() {
        executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        ServerMsgReaderRunnable r = new ServerMsgReaderRunnable(channel);
        executorService.submit(r);
    }
}
