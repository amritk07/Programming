package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;  
public class MysqlCon{  
public static void main(String args[]){  

try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/test1","root","");  
//here test1 is database name, root is username and password  
Statement stmt=con.createStatement();  
System.out.println(con);
//int k = stmt.executeUpdate("rename table emp1 to emp");
//System.out.println(k);
 String s3 = "delete  from emp where id = 54 and pass = 'asd'";
 int i = stmt.executeUpdate(s3);
 int j = stmt.executeUpdate("insert into emp values(8,'pqr')");
if(j==1)
{
	System.out.println("New Record Successfully Inserted");
}
ResultSet rs=stmt.executeQuery("select * from emp where id="+args[0]+" "+"and"+" "+"pass ="+"'"+ args[1]+"'"); 

while(rs.next())  
System.out.println(rs.getInt(1)+" "+rs.getString(2));  


  


//int k = stmt.executeUpdate("rename table emp to emp1");
con.close();  
}catch(Exception e){ System.out.println(e);}  

}  
}  
