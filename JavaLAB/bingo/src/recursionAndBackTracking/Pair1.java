package recursionAndBackTracking;
import java.util.*;
public class Pair1 {
public static int count(int n)
{
	if(n==0||n==1)
	{
		return 1;
	}
	if(n<0)
	{
		return 1;
	}
	return count(n-1) + (n-1)*count(n-2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println(count(4));
	}

}
