package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
     	   Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
     	   System.out.println("hello");
     	   PreparedStatement p1 = cn.prepareStatement("insert into even (num) values (124) ,(224) ");
     	  // p1.setInt(1, 420);
     	  if( p1.executeUpdate()>0)
     	  {
     		  System.out.println("Successfully inserted!");
     	  }
     	   
     	   PreparedStatement p2 = cn.prepareStatement("select  * from even");
     	   ResultSet r1 = p2.executeQuery();
     	   while(r1.next())
     	   {
     		   System.out.println(r1.getInt(1));
     	   }
     	   
     	   
     	   
     	   
     	   
     	   
     	   
     	   
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
