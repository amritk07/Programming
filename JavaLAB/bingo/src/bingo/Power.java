package bingo;
import java.util.*;

public class Power {
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
     System.out.println("Enter");
     int a = in.nextInt();
     int b = in.nextInt();
     in.close();
     int c = calPower(a, b);
     System.out.println(c);
		
	}

}
