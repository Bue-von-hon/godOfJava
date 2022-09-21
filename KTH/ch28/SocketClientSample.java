import java.io.*;
import java.net.Socket;
import java.util.Date;

public class SocketClientSample {
    public static void main(String[] args) throws IOException {
        SocketClientSample sample = new SocketClientSample();
        sample.sendSocketSample();
    }

    private void sendSocketSample() throws IOException {
        Socket socket = new Socket("localhost", 9999);
        sendSocketData(socket);
        receiveSocketData(socket);
        socket.close();
    }

    private void sendSocketData(Socket socket) {
        try {
            System.out.println("connecting");
            System.out.println("connect status = "+socket.isConnected());
            Thread.sleep(1000);
            OutputStream outputStream = socket.getOutputStream();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            byte[] bytes = "hi".getBytes();
            bufferedOutputStream.write(bytes);
            System.out.println("sent data");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void receiveSocketData(Socket socket) {
        try {
            System.out.println("connecting");
            System.out.println("connect status = "+socket.isConnected());
            Thread.sleep(1000);
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String data = "";

            while ((data=bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
