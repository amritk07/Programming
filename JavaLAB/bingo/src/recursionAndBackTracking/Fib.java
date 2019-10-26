package recursionAndBackTracking;
import java.util.*;
public class Fib {

	public static int fib(int n)
	{
		if(n==1||n==0)
		{
			return n;
		}
			
		else {
			return  fib(n-1) + fib(n-2);
		
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in = new Scanner(System.in);
       System.out.println("Enter");
       int s = in.nextInt();
       System.out.println(fib(s));
		
		
		
	}

}
