import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		int port = 5555;
		try {
			ServerSocket server = new ServerSocket(port); //server must always run before client
			System.out.println("Server Starting...");
			Socket connect = server.accept(); // waits for client to connect to server
			System.out.println("Client CONNECTED BOIIIII");
			server.close();
			connect.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
