package Test1;

import java.io.*;
import java.net.*;

public class TCPClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
	
		Socket client = null; 
		
		client = new Socket("localhost", 8888);
		
		BufferedReader buf = null;

		buf = new BufferedReader(new InputStreamReader(client.getInputStream())); 
		String str = buf.readLine(); 
		
		System.out.println("服务器运行" + str);
		client.close(); 
		buf.close(); 
	}
}
