import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("connection success!");
        try (Socket socket = new Socket("localhost", 1234)) {
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(out);
            while (true) {
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                if ("q".equals(s)) break;
                dos.writeBytes(s);
                dos.writeBytes("\n");
                out.flush();
            }
        }
        catch (Exception e) {

        }
    }
}
