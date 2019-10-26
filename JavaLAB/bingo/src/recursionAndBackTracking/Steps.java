package recursionAndBackTracking;
import java.util.*;
public class Steps {
public static int count(int n)
{
	if(n==0||n==1)
	{
		return 1;
	}
	if(n<0)//handle negative case
	{
		return 0;
	}
	return count(n-1) + count(n-2) + count(n-3);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
       System.out.println(count(n));
	}

}
