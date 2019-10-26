package exam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

import com.mysql.jdbc.ResultSet;
public class githa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			 //Scanner d1 = new Scanner(System.in);
			 Class.forName("com.mysql.jdbc.Driver");
      	   Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
         Scanner sn = new Scanner(System.in);
         int i =0;
         System.out.println("Enter 1 to insert new name, 2 to display existing name");
          i = sn.nextInt();
          
          if(i==1)
          {
        	  System.out.println("Enter new name");
        	  
        	  String s1 = sn.next();
        	  PreparedStatement p1 = cn.prepareStatement("insert into ss values(?)");
        	  p1.setString(1,s1);
        	  int h = p1.executeUpdate();
        	  if(h==1)
        	  {
        		  System.out.println("Successfully inserted!");
        	  }
          }
          if(i==2)
          {
       
        	  PreparedStatement p2 = cn.prepareStatement("select * from ss");
        	 java.sql.ResultSet r1 = p2.executeQuery();
        	  while(r1.next())
        	  {
        		  System.out.print(r1.getString(1));
        		  
        		  System.out.print(" ");
        	  }
          }

          
          
          
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}

}
