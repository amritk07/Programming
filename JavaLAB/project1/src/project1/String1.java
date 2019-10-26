package project1;
import java.util.Scanner;
import java.util.StringTokenizer;
class B
{
	Scanner input = new Scanner(System.in);
	String s;
   void getInput()
   {
	   System.out.println("Enter");
	    s = input.nextLine(); /*my name is amrit kumar*/
	    
   }
   void display()
   {
	   System.out.println(s);//my name is amrit kumar
	   char c=s.charAt(0);
	   System.out.println("1st character is: "+c);  //1st character is: m
	   
	   
   }
	
}
public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d;
   B b = new B();
   b.getInput();
   b.display();
   StringTokenizer st1 =  new StringTokenizer(b.s, " "); 
  
   int count = st1.countTokens();
    
   while (st1.hasMoreTokens()) {
    System.out.println(st1.nextToken());}
  for(int i=1;i<=count;i++)
   {
	    d = st1.nextToken();
	    
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
