import java.io.IOException;
import java.net.*;

public class Client {

	public static void main(String[] args) {
		String address = "192.168.1.101";
		int port = 5555;
		Socket connection = new Socket();
		try {
			System.out.println("Connecting to server...");
			connection.connect(new InetSocketAddress(address, port));
			System.out.println("Connected YEET");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Could not connect to server");
		}

	}

}
