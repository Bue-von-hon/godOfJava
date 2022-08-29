import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            Socket connection = new Socket();
            while ( (connection = serverSocket.accept()) != null) {
                ServerHandler handler = new ServerHandler(connection);
                handler.start();
            }
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
