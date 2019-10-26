package recursionAndBackTracking;
import java.util.*;
public class Tiling0 {

	public static int count(int n)
	{
		if(n==1)
		{
			return 1;
		}
		if(n==2)
		{
			return 2;
		}
		return count(n-1) + count(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //given a 2Xn board and tiles of size 2 X 1, count no of ways........
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(count(n));
		
		
		
	}

}
