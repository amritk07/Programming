package bingo;
import java.util.*;
public class PlayingWithBits {
	
   public static int countSetBits(int a,int b)
   {
	   int count =0;
	   for(int i = a;i<=b;i++)
	   {
		  while(i>0)
		  {
			  count += (i&1);
			  i = i>>1;
		  }
		  i = a;
		  a++;
	   }
	   
	   return count;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner in = new Scanner(System.in);
      System.out.println("Enter no of Queries");
      int n = in.nextInt();
      int[] a = new int[n];
      int[] b = new int[n];
      try {
      for(int i =0;i<n;i++)
      {
      System.out.println("Enter range a And b");//both inclusive
       a[i] = in.nextInt();
       b[i] = in.nextInt();
      }
      for(int i =0;i<n;i++)
      {
       System.out.println("Count: "+countSetBits(a[i], b[i]));
      }
      }
      catch (Exception e) {
		// TODO: handle exception
    	  e.printStackTrace();
	}
		
		
	}

}
