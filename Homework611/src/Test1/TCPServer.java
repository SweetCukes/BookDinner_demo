package Test1;

import java.io.*;
import java.net.*;

public class TCPServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		ServerSocket server = null;
		Socket client = null;
		PrintStream out = null;
		server = new ServerSocket(8888);
		System.out.println("服务器成功运行");
		client = server.accept();
		String str = "hello world!!!";
		out = new PrintStream(client.getOutputStream());
		out.println(str); 
		out.close(); 
		client.close();
		server.close(); 
	}
};
