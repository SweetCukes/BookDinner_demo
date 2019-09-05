package Test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class Test1 {
	public static void main(String[] args) throws Exception {
		
		List<student> list = select();
		for(student student:list) {
			System.out.println(student);
		}
	}
	
	public static Connection getConnection() throws Exception {
		String driver = "com.mysql.jdbc.driver";
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String pass = "123";
		return DriverManager.getConnection(url,user,pass);
		
	}
	
	public static void	 updateDate() throws Exception {
		Connection connection = getConnection();
		java.sql.Statement stmt = null;
		String sql0 = "undate student set age=24 where id=2";
		String sql1 = "undate student set number=20162248 where id=1";
		String sql2 = "undate student set name='xxx' where id=3" ;
		stmt = connection.createStatement();
		stmt.addBatch(sql0);
		stmt.addBatch(sql1);
		stmt.addBatch(sql2);
		stmt.executeBatch();
		
		stmt.close();
		connection.close();
		
	}
	
	public static void insert() throws Exception {
		Connection connection = getConnection();
		java.sql.PreparedStatement pstmt = null;
		String sql = "insert into student(id,name,number,age)"+"values(?,?,?,)";
		pstmt = connection.prepareStatement(sql);
		for (int i = 0; i < 10; i++) {
			pstmt.setInt(1, i+10);
			pstmt.setString(2,"name"+ i);
			pstmt.setInt(3, 12321);
			pstmt.setInt(4, 123);
			pstmt.addBatch();
		}
		
		pstmt.executeBatch();
		pstmt.close();
		connection.close();
	}
	
	
	

	private static List<student> select() throws Exception {
		List<student> list = new ArrayList<student>();
		Connection connection = getConnection();
		PreparedStatement pStatement = null;
		String sql = "select * from student where name like?";
		pStatement = (PreparedStatement) connection.prepareStatement(sql);
		
		return null;
	}
}
