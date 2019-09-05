package cn.utils;
/*
 * 用静态工厂方法管理一个唯一的可重用的连接
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnUtils {
	private static Connection conn;
	//静态代码块中创建与数据库的连接
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/crm";
			conn = DriverManager.getConnection(url,"root","123");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(),e	);
		}
		
		
	}
	public static Connection getCon() {
		return conn;
		
	}
	
	public static void main(String[] args) {
		System.err.println(getCon());
	}
}
