package Test1;

import java.net.*;
import java.io.*;
public class TCPClient1 {
	public static void main(String artsg[]) throws Exception { 
		
		Socket client = null ;
		client = new Socket("localhost",8080) ; 
		BufferedReader buf = null ;
		PrintStream out = null ; 
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in)) ;
		buf = new BufferedReader(new InputStreamReader(client.getInputStream())) ;
		out = new PrintStream(client.getOutputStream()) ; 
		
		Boolean flag = true ;

		while(flag){ 
			System.out.print("服务器成功运行") ; 
			String str = input.readLine() ; 
			out.println(str) ;
			if("bye".equals(str)){
				flag = false ;
			}else{   
				String echo = buf.readLine() ;   
				System.out.println(echo); 
			}
			buf.close() ;
			client.close() ; 
		}
	}
}
