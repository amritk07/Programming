package bingo;
import java.util.*;
public class Head {
	public static int calPower(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
		int smallAns = calPower(x, n/2);
		smallAns *= smallAns;
		if((n&1)!=0)
		{
			smallAns *= x;
			return smallAns;
		}
		return smallAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner in = new Scanner(System.in);
       System.out.println("Enter ");
       int n = in.nextInt();
       int x = 0;
       x = calPower(2, n+1)-2;//x = 2N+1-2
       System.out.println(x);
		
	}

}
