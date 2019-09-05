package Test2;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class GuessServe {

	public static void main(String[] args)throws Exception {
		ServerSocket server = null;
		HashMap<String, Socket> hm = new HashMap<>();
		server = new ServerSocket(8080);
		System.out.println("服务器运行，等待客户端连接");
		boolean flag = true;
		
		Socket client = server.accept();
		hm.put(client.getPort()+"",client	);
		ServerThread ts = new ServerThread();
		ts.setsocket(client);
	}
}
