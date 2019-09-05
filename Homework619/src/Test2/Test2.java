package Test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Test2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        findAll();      
        inset();
        delet(); 
        gengxin();
    }
    
    //更新 
    public static void gengxin(){
         Connection connection=null;
         Statement statement=null;
        
         String url="jdbc:mysql://localhost:3306/epet";
         String user="root";
         String password="123";
        String sql = "UPDATE master SET name='ljy',password='gggg',money=1000 WHERE id=118";
         //驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
         //获得连接对象
         try {
            connection=DriverManager.getConnection(url, user, password);
        
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//            获取Statement
         try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
         
         
         try {
            statement.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         try {
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    
//    删除
    public static void delet(){
         Connection connection=null;
         Statement statement=null;
        
         String url="jdbc:mysql://localhost:3306/epet";
         String user="root";
         String password="root";
         String sql = "DELETE FROM master WHERE id=117";
         
         //驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
         //获得连接对象
         try {
            connection=DriverManager.getConnection(url, user, password);
        
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//            获取Statement
         try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
         
         
         try {
            statement.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         try {
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    //查看全部
    public static void findAll(){
    Connection  connection =null;
     Statement statement=null;
     ResultSet resultSet= null;
     String url="jdbc:mysql://localhost:3306/epet";
     String user="root";
     String password="root";
     String sqlsString = "SELECT * FROM master";
     //驱动
     try {
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection(url, user, password);
        statement =connection.createStatement();
        resultSet =statement.executeQuery(sqlsString);
        while(resultSet.next()){
            
            System.out.println(resultSet.getObject("id")+"\t");
            System.out.println(resultSet.getObject("name")+"\t");
            System.out.println(resultSet.getObject("password")+"\t");
            System.out.println(resultSet.getObject("money")+"\t");
            System.out.println("*******************************");
            
        }
        
    } catch (SQLException | ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }finally{
        try {
            if(null !=resultSet){
                resultSet.close();
            }if(null != statement){
                statement.close();
            }
            if(null !=connection ){
                connection.close();
            }
            
            
        } catch (Exception e2) {
            // TODO: handle exception
        }
    }
     
    
    
     
    }
    
//增加
     public  static void  inset(){
         Connection connection=null;
         Statement statement=null;
        
         String url="jdbc:mysql://localhost:3306/epet";
         String user="root";
         String password="root";
         String sqlString="INSERT INTO master(name,password,money) VALUES ('zhh','v5',10000000)";
         
         //驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
         //获得连接对象
         try {
            connection=DriverManager.getConnection(url, user, password);
            System.out.println("连接成功");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//            获取Statement
         try {
            statement = connection.createStatement();
            statement.executeUpdate(sqlString);
            System.out.println("添加成功");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
         
         
         try {
            statement.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         try {
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
         
         
     }
    
    
     
     
}