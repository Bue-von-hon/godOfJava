import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample {
    public static void main(String[] args) {
        SocketServerSample sample = new SocketServerSample();
        sample.startServer();
    }

    private void startServer() {
        ServerSocket server = null;
        Socket client = null;
        try {
            server = new ServerSocket(9999);
            while (true) {
                System.out.println("server waiting for req");
                client = server.accept();
                System.out.println("server accepted");
                InputStream inputStream = client.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                String data = "";
                StringBuilder stringBuilder = new StringBuilder();
                while ((data=bufferedReader.readLine()) != null) {
                    stringBuilder.append(data);
                }
                System.out.println("received data = "+stringBuilder);
                bufferedReader.close();
                inputStream.close();
                client.close();
                if (stringBuilder != null && "x".equals(stringBuilder.toString())) {
                    System.out.println("server stop");
                    break;
                }
                System.out.println("------------");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                server.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
