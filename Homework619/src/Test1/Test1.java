package Test1;

import java.sql.*;

import com.mysql.jdbc.MySQLConnection;
import com.mysql.jdbc.MysqlIO;

public class Test1 {
	public static void main(String[] args) {

	     pageSelect(2,3);

	   }

	   public static void pageSelect(int page,int pageSize){

	     Connection con=null;

	     PreparedStatement ps=null;

	     ResultSet rs=null;

	     String sql="select * from users limit ?,?";

	     try{

	        con=MysqlJdbc.getConnection()； 

	        ps=con.prepareStatement(sql);

	        ps.setInt(1,(page-1)*pageSize);

	        ps.setInt(2,pageSize);

	        rs=ps.executeQuery();

	        while(rs.next()){

	   System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+rs.getString("password"));

	        }

	     }catch(Exception e){

	        e.printStackTrace();

	     }finally{

	        MysqlJdbc.dbClose(rs,ps, con);

	     }

	    

	   }
}
