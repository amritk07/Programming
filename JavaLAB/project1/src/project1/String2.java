package project1;

import java.util.Scanner;
import java.util.StringTokenizer;

class B2
{
	Scanner input = new Scanner(System.in);
	String s;
   void getInput()
   {
	   System.out.println("Enter");
	    s = input.nextLine(); 
	    
   } }
   class B3
   {
	   B2 b = new B2();
   StringTokenizer st1 =  new StringTokenizer(b.s, " "); 
   void display() {
   int count = st1.countTokens();
    
   while (st1.hasMoreTokens()) {
    System.out.println(st1.nextToken());}
  for(int i=1;i<=count;i++)
   {
	 String d = st1.nextToken();
	    
	   for(int j=1;j<=count;j++)
	   {
		   if(st1.nextToken()==d)
		   {
			   System.out.println(st1.nextToken());
		   }
	   }
   
      
   }
	}
   }
public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      B2 d1 = new B2();
      d1.getInput();
      B3 d2 = new B3();
      d2.display();
	}

}
