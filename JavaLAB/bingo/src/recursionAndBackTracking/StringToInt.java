package recursionAndBackTracking;
import java.util.*;
public class StringToInt {
public static int convert(char[] a , int b,int l)
{
	 String s1 =  Character.toString(a[l-b]) ;
	   if(s1.length()<b&&b!=1)
	   {
		   
		  s1= s1 +  Integer.toString(convert(a, b-1,l));
		  
		  //return Integer.parseInt(s1);
	   }
	   if(b==0)
	   {
		   String s2 = Character.toString(a[l-1]);
		   int i = Integer.parseInt(s2);
		   return i;
	   }
	   
	   return Integer.parseInt(s1);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter length");
		
		int n = in.nextInt();
		char[] ch = new char[n];
		for(int i = 0;i<n;i++)
		{
			ch[i] = in.next().charAt(0);
		}
		       System.out.println(convert(ch,n,n));
		
		
		
		
	}

}
