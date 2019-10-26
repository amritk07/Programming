import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Mysql1 extends MysqlCon{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection c = null;
       try
       {
    	   
    	   Statement stmt=c.createStatement();  
    	   ResultSet rs=stmt.executeQuery("select * from emp");  
    	   while(rs.next())  
    	   System.out.println(rs.getInt(1)+" "+rs.getString(2));  
    	   c.close();  
       }
       catch(Exception e)
       {
    	   System.out.println(e);
       }
	}

}
