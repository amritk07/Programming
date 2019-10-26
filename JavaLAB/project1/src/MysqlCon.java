import java.sql.*;  
 import java.sql.*;  
class MysqlCon{  
public static void main(String args[]){  

try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/test1","root","");  
//here test1 is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from emp");  
while(rs.next())  
System.out.println(rs.getInt(1)+" "+rs.getString(2));  
//con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  