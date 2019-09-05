package Test2;

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;

public class OStudentImpi implements OperateStudent {

	@Override
	public void addStudent(Connection connection) {
		PreparedStatement preparedStatement = null;
		String sql = "insert into student(sno,sname,ssex,sage) values(?,?,?,?,?)";
		int num=0;
		try {
			preparedStatement=(PreparedStatement) connection.prepareCall(sql);
			preparedStatement.setInt(1, 232);
			preparedStatement.setString(2, "张飒");
			preparedStatement.setString(3, "男");
			preparedStatement.setInt(4, 27);
			preparedStatement.setString(5, "cs");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close();
			} catch (Exception e) {
e.printStackTrace();
				// TODO: handle exception
			}
		}
		if (num>=1) {
			System.out.println("success");
		}else {
			System.out.println("failed");
		}
	}
	

	@Override
	public void updateStudent(Connection connection) {
		PreparedStatement preparedStatement = null;
		String sql = "insert into student(sno,sname,ssex,sage) values(?,?,?,?,?)";
		int num=0;
		try {
			preparedStatement=(PreparedStatement) connection.prepareCall(sql);
			preparedStatement.setInt(1, 232);
			preparedStatement.setString(2, "张飒");
			preparedStatement.setString(3, "男");
			preparedStatement.setInt(4, 27);
			preparedStatement.setString(5, "cs");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close();
			} catch (Exception e) {
e.printStackTrace();
				// TODO: handle exception
			}
		}
		if (num>=1) {
			System.out.println("success");
		}else {
			System.out.println("failed");
		}
		
	}
}
