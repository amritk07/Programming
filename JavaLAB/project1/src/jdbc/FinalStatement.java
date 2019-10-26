package jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.*;
public class FinalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  Connection cn = Myconnection.createMyconnection();
    	 java.sql.Statement s1 = cn.createStatement();
    	  
           ResultSet  rs=	  s1.executeQuery("select * from bingo");
    	  while(rs.next())
    	  {
    		  System.out.println(rs.getString(1));
    	  }
    	  
    	  s1.executeUpdate("insert into bingo values('OFF','123','123')");
    	  
    	  
		
	     }
      
      
      
      
      
      
      
      
      
      
      catch (Exception e) {
		// TODO: handle exception
	}
	}

}
