package collection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.mysql.jdbc.ResultSet;

import java.util.*;
class Worker
{
	String name,id,pass;
	
	Worker(String name, String id, String pass){
	
      this.name = name;
      this.id = id;
      this.pass = pass;
}
}
public class New1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/test1","root",""); 
		Scanner sn = new Scanner(System.in);
           ArrayList<Worker> a1 = new ArrayList<Worker>();
           a1.add(new Worker("amrit", "111", "123"));
       System.out.println("Enter 1 to insert, 2 to delete, 3 to update");
       int i = sn.nextInt();
       if(i==1)
       {
    	   System.out.println("Enter name, id and pass");
    	   String s1 = sn.next();
    	   String s2 = sn.next();
    	   String s3 = sn.next();
    	   PreparedStatement p1 = con.prepareStatement("insert into bingo values(?,?,?)");
    	   p1.setString(1, s1);
    	   p1.setString(2, s2);
    	   p1.setString(3,s3);
    	  if( p1.executeUpdate()==1)
    	  {
    		  System.out.println("Successfully Updated in Database!");
    	  }
    	   if(a1.add(new Worker(s1,s2,s3)))
    	   {
    		   System.out.println("Successfully inserted in arraylist");
    	   }
    	   /* for(Worker x : a1)
    	    {
    	    	System.out.println(x.name+" "+x.id+" "+x.pass);
    	    }*/
    	  /* PreparedStatement stmt=con.prepareStatement("select * from bingo");
    	    //stmt.setString(1,s2);
    	   java.sql.ResultSet rs=stmt.executeQuery();  
    	   while(rs.next()){  
    	   System.out.println(rs.getString(1)+" "+rs.getString(2));  
    	   } */  } 
       if(i==2)
       {
    	   System.out.println("Enter id to delete");
    	   String s4 = sn.next();
    	   ArrayList<Worker> a2 = new ArrayList<Worker>();
    	   for(Worker x : a1)
    	   {
    		   if(x.id.equals(s4))
    		   {
    			   if(a1.remove(new Worker(x.name,x.id,x.pass)))
    			   {
    				   System.out.println("Successfully removed from collection");
    			   }
    		   }
    	   }
    	   PreparedStatement t1 = con.prepareStatement("delete from bingo where id = ?");
    	   t1.setString(1, s4);
    	   if(t1.executeUpdate()>0)
    	   {
    		   System.out.println("Successfully removed from databse!");
    	   }
    	  /* for(Worker x : a1)
   	    {
   	    	System.out.println(x.name+" "+x.id+" "+x.pass);
   	    }
    	   PreparedStatement stmt=con.prepareStatement("select * from bingo");
   	  
   	       java.sql.ResultSet rs=stmt.executeQuery(); 
   	   
   	   System.out.println("Database");
   	   while(rs.next())
   	   {  
   	   System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));  
   	   }*/ 
   	   
       } 
    	   
       }
		
	catch (Exception e) {
	         
			System.out.println(e);
			// TODO: handle exception
		}
		
		
       
	}

}
