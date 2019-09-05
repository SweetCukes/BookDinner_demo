package Test2;

import java.io.*;
import java.net.*;
 
public class HtmlRequest {
 
		public static void main(String[] args) throws IOException {
			URL url = new URL("http://www.baidu.com/");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			InputStream inputStream = conn.getInputStream();   //ͨ�������������վ����
			byte[] getData = readInputStream(inputStream);     //�����վ�Ķ���������
			String data = new String(getData, "gb2312");
			System.out.println(data);
			
		}
 
		public static  byte[] readInputStream(InputStream inputStream) throws IOException {
			byte[] buffer = new byte[1024];
			int len = 0;
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			while((len = inputStream.read(buffer)) != -1) {
				bos.write(buffer, 0, len);
			}
			
			bos.close();
			return bos.toByteArray();
		}
		
}
