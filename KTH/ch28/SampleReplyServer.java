import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SampleReplyServer {
    public static void main(String[] args) {
        SampleReplyServer sample = new SampleReplyServer();
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

                System.out.println("server stop");
                OutputStream outputStream = client.getOutputStream();
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                String a = "OK";
                byte[] bytes = a.getBytes();
                bufferedOutputStream.write(bytes);
                bufferedOutputStream.close();
                System.out.println("------------");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
