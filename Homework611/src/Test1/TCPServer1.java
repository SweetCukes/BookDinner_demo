package Test1;

import java.net.*;

public class TCPServer1 {
	public static void main(String args[]) throws Exception {  
		ServerSocket server = null;
 
		server = new ServerSocket(8080);           
		System.out.println("服务器成功运行");       
		boolean flag = true;           
		while (flag) { 

			Socket client = server.accept();             
			ServerThread ts= new ServerThread();        
			ts.setsocket(client);    
			ts.start(); 
		} 
		server.close(); ;
	}
}
