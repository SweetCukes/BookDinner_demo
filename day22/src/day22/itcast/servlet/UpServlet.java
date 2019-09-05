package day22.itcast.servlet;

import java.io.IOException;
import java.io.InputStream;

/*
 * 如果一个表单类型是post而且enctype为multipart/for-dae
 * 则所有数据都是以二进制方式向上传递
 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class UpServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String txt = request.getParameter("txt"); //返回null
		System.err.println("txt is :"+txt);
		System.err.println("============");
		InputStream in = request.getInputStream();
		byte[] b = new byte[1024];
		int len = 0;
		while ((len=in.read(b))!=-1) {
			String s = new String(b,0,len);
			System.err.println(s);
		}
		
	}

}
