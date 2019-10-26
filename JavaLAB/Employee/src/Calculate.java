import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.AALOAD;

public class Calculate extends HttpServlet {

	
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter p1 = response.getWriter();
		String s1 = request.getParameter("fname");
		String s2 = request.getParameter("salary");
		//p1.println("Welcome"+s1);
		int i = Integer.parseInt(s2);
		double s3 =  i + 0.20*i +0.90*i;
		p1.println("<b> GROSS SAL </b> <br>");
		p1.println("<b> SHEET </b> <br>");
		p1.println("<b> HELLO </b> "+s1+"<br>");
		p1.println("<b> YOUR GROSS SAL IS </b>"+s3);
		//p1.println(s3);
                             
		
		
	     
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
