package Test2;

import java.io.*;
import java.net.*;

public class ReqResClient {
	public void sendHttp() throws IOException{  
		
	    URL url = new URL("http://localhost:8080/ImitateRequest/servlet/servlet");    
	    
	    HttpURLConnection conn = (HttpURLConnection) url.openConnection();          
	      
	    conn.setDoOutput(true);                    
	    conn.setRequestMethod("POST");                                                

	    conn.setRequestProperty("referer", "http://www.sina.com/index.html");  
	    OutputStream out = conn.getOutputStream();  
	    out.write("name=aaaa".getBytes());          
	      
	    conn.getResponseCode();                  
		}
	public void readHttp() throws IOException{
        URL url = new URL("http://localhost:8080/ImitateRequest/servlet/servlet");   
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        
        System.out.println(conn.getResponseCode());                     
        System.out.println(conn.getHeaderField("Content-Length"));     
        InputStream in = conn.getInputStream();                        
        try{
            int len = 0;
            byte[] buffer = new byte[1024];
            while((len = in.read(buffer))>0){
                System.out.println(new String(buffer,0,len));  
            }
        }finally{
            if(in!=null)
                try{
                    in.close();
                }catch(Exception e){
                }
        }
    } 
}
