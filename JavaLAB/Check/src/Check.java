import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import com.sun.org.apache.bcel.internal.generic.POP2;

public class Check extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter p1 = response.getWriter();
		String s1  = request.getParameter("fname");
		String s2  = request.getParameter("id");
		String s3  = request.getParameter("pass");
		String s4  = request.getParameter("dname");
		String s5  = request.getParameter("sal");
		String s6 = request.getParameter("age");
		p1.println("Welcome: "+s2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		p1.print("Welcome"+s1);
		Connection cn = null;
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			 cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");  
			//here test1 is dtatabase name, root is username and password  
          // p1.print(cn);
			PreparedStatement p2 = cn.prepareStatement("insert into login1 values(?,?,?,?,?,?)");
			p2.setString(1, s1);
			p2.setString(2, s2);
			p2.setString(3, s3);
			p2.setString(4, s4);
			p2.setString(5, s5);
			p2.setString(6, s6);
			p2.executeUpdate();
		    if(p2.executeUpdate()==1)
		    {
		    	response.sendRedirect("login1.html");
		    }
			}
		 catch(Exception e)
		     { 
				System.out.println(e);
		     }
		    
		    // p1.print(cn);
		    
		
		}
		
	
	

}
