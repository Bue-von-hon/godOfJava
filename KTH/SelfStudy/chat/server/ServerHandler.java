import java.io.*;
import java.net.Socket;

public class ServerHandler extends Thread{
    private Socket socket;
    public ServerHandler(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try (InputStream in = socket.getInputStream(); OutputStream out = socket.getOutputStream()) {
            BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"));
            while (true) {
                String s = br.readLine();
                if (s.isEmpty()) break;
                System.out.println(socket.getPort()+" "+socket.getLocalPort()+" "+socket.getLocalAddress()+" "+socket.getLocalSocketAddress()+" "+s);
            };
        }
        catch (Exception e) {

        }
    }
}
