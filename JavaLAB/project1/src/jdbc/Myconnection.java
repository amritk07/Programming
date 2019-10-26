package jdbc;
import java.sql.*;
 public class Myconnection{ 
	public static Connection createMyconnection()
	{
	Connection cn = null;
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		 cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");  
		//here test1 is database name, root is username and password  

		}
	 catch(Exception e)
	     { 
			System.out.println(e);
	     }
	return cn;
 }  
}
