import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class MysqlJdbc2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.driver");
			System.out.println("驱动类已找到");
		} catch (Exception e) {
			System.out.println("找不到驱动类");
			e.printStackTrace();
		}
		try {
			Connection connection  = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/619","root","123"
					);
			
			System.out.println("连接成功");
			Statement stmt = (Statement) connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from user");
			
			while (rs.next()) {
				System.out.println(rs.getString("name"));
				
			}
		} catch (Exception e) {
			System.out.println("获取错误");
			e.printStackTrace();
		}
	}
	
}
