import java.io.*;
import java.net.*;
public class Server {
	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(Integer.parseInt(args[0]));
		}catch(Exception e) {
		}
		while(true) {
			Socket client = null;
			DataInputStream input = null;
			PrintStream output = null;
			try {
				client = server.accept();
			}catch(Exception e) {
				System.out.println(e);
			}
			try {
				input = new DataInputStream(client.getInputStream());
				output = new PrintStream(client.getOutputStream());
			}catch(Exception e) {
				System.out.println(e);
			}
			output.println("Enter the filename: ");
			try {
				String fname = input.readLine();
				System.out.println("Client requested file is: "+fname);
				File f = new File(fname);
				BufferedReader br = new BufferedReader(new FileReader(f));
				String data;
				while((data = br.readLine()) != null) {
					output.println(data);
				}
				client.close();
			}catch(Exception e) {
				output.println(e);
			}
		}
	}
}
