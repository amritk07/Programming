package hello;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager.*;
public class Myconnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		System.out.println("hello");
      try {
		Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/test1","root","");
    	  System.out.print(con);
    	  
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	}

}
