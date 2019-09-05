package Test3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

public class UtilsDao {
	private static Connection connection = null;
	private static PreparedStatement pstmt= null;
	private static ResultSet rst = null;
	
	static {
		try {
			connection = DButils.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public ResultSet executeQuery(String query,List<Object> params) {
			try {
				pstmt = (PreparedStatement) connection.prepareCall(query);
				if (params != null && params.size()>0) {
					for (int i = 0; i < params.size(); i++) {
						pstmt.setObject(i+1, params.get(i));
					}
				}
				rst = pstmt.executeQuery();
			} catch (SQLException e) {
				// TODO: handle exception
			}
		return rst;
		
	}
}
