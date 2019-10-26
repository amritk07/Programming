package recursionAndBackTracking;
import java.util.*;
public class Series {

	public static int testSeries(int n)
	{
		
		if(n==1)
		{
			return 2;
		}
		if(n==0)
		{
			return 0;
		}
		else {
			return testSeries(n-1) + n*2;
		     }
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("Enter");
        int n1 = in.nextInt();
        System.out.println(testSeries(n1));
		
		
		
	}

}
