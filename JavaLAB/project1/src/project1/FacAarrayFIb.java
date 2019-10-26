package project1;
import java.util.Scanner;

public class FacAarrayFIb {

	/*public static void main(String[] args) {
		int first=0,second=1,next;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n");
		int n = s.nextInt();
          for(int i=0;i<n;i++)
          {
        	  if(i<=1)
        		  System.out.println(i);
        	  if(i>1)
        	  {
        		  next = first+second;
        		  first=second;
        		  second = next;
        		  System.out.println(next);
        		  
        	  }
        	  
          }
	}

}*/
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter n");
	int n = s.nextInt();
	int fact=1;
	if(n<=1)
 		  System.out.println("Factorial is 1");
	
	
	else  {
		for(int i=1;i<=n;i++)
     {
   	  
   	  fact = i*fact;
   }
	System.out.println("Factorial is "+fact);
}}
}