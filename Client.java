import java.net.*;
import java.io.*;
public class Client {
	public static void main(String[] args) {
		Socket client = null;
		BufferedReader br = null;
		try {
			System.out.println(args[0]+" "+args[1]);
			client = new Socket(args[0],Integer.parseInt(args[1]));
		}catch(Exception e) {
		}
		DataInputStream input = null;
		PrintStream output = null;
		try {
			input = new DataInputStream(client.getInputStream());
			output = new PrintStream(client.getOutputStream());
			br = new BufferedReader(new InputStreamReader(System.in));
			String str = input.readLine();
			System.out.println(str);
			String fname = br.readLine();
			if(fname != null) {
				output.println(fname);
			}
			String data;
			while((data = input.readLine()) != null) {
				System.out.println(data);
			}
			client.close();
		}catch(Exception e) {System.out.println(e);
		
	}
	}
}
