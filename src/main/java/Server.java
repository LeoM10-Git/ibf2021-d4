import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.zip.InflaterOutputStream;

public class Server {
    public static void main(String[] args) throws IOException {
        Cookie getCookie = new Cookie();
        getCookie.generateCookie();

        ServerSocket server = new ServerSocket(3000);
        Socket socket = server.accept();


        try(InputStream is = socket.getInputStream() ){
            DataInputStream dis = new DataInputStream(new BufferedInputStream(is));
            String line = dis.readUTF();

            System.out.println("Hello "+ line);

        }catch (EOFException e){
            socket.close();
        }


    }
}
