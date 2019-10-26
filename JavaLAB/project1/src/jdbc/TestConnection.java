package jdbc;

import java.sql.*; 
public class TestConnection{  
public static void main(String args[]){  

try{ 
Connection con = Myconnection.createMyconnection();

PreparedStatement p1 = con.prepareStatement("insert into emp values(53,'asd')");
int i =p1.executeUpdate();
if(i!=0)
{
	System.out.println("New Record Successfully inserted!");
}

Statement stmt=con.createStatement(); 
ResultSet rs=stmt.executeQuery("select * from emp");  
while(rs.next())
System.out.println(rs.getInt(1)+" "+rs.getString(2));  
  
}catch(Exception e){ System.out.println(e);}  
}  
}  