package exam;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashSet;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

import java.sql.*;
public class jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
        	   Class.forName("com.mysql.jdbc.Driver");
        	   Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
        	    java.sql.Statement s1 = cn.createStatement();
        	    //s1.executeUpdate("delete from bingo where id = '4'");
        	    //s1.executeUpdate("create table hhh (m integer(10), n varchar(10) )");
        	    //s1.executeUpdate("insert into bingo (name,id,pass) values ('aaa','444','444'), ('Anant','420','420')");
        	    //s1.executeUpdate("insert into bingo values("+" "+"'"+args[1]+"'"+", '123','123')");
        	            	    
        	   ResultSet r2=   s1.executeQuery("select * from bingo"+" "+"where id =" + "'" +args[0] + "'");
        	 
        	 while(r2.next())
        	 {
        		System.out.println(r2.getString(1)+" " +r2.getString(2)+" " +r2.getString(3)); 
        	 
             } }
         catch(Exception e)
         {
        	 System.out.println(e);
         }
	}

}
