import java.sql.Connection;

import javax.sql.DataSource;

public class Demo {
	public static void main(String[] args) throws Exception {
		DataSource ds = new DBPool()	;
		Connection c1 = ds.getConnection();
		Connection c2 = ds.getConnection();
		Connection c3 = ds.getConnection();
		System.err.println(c1+"\n"+c2+"\n"+c3);
		
		
	}
}
