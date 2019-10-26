package recursionAndBackTracking;
import java.util.*;
public class Tiling1 {
	public static int count(int n,int m)
	{
		if(n==1||n < m)
		{
			return 1;
		}
		if(n==m)
		{
			return 2;
		}
		
		
		
		return count(n-1, m) + count(n-m, m);
		
	}
   public static void main(String args[])
   {
	   Scanner in = new Scanner(System.in);
	   System.out.println("Enter");
	   int t = in.nextInt();
	   int y =t;
	   int n[] = new int[t];
	   int m[] = new int[t];
	   int i =0;
	   while(t>0)
	   {
	    n[i] = in.nextInt();
	    m[i] = in.nextInt();
	    i++;
	    t--;
	   }
	   
	   i =0;
	   
	   
	   while(y>0)
	   {
	   System.out.println(count(n[i],m[i]));
	   i++;
	   y--;
	   }
   }

}
