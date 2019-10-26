package recursionAndBackTracking;
import java.util.*;
public class ComputePower {
public static long calPower(long a,long b)
{
	if(b==0)
	{
		return 1;
	}
	long ans = calPower(a, b/2);
	ans *= ans;
	if((b&1)==1)
	{
		
		return ans*a;
	}
	return ans;
	
	
}
public static long calPowerSlow(long a,long b)
{
	if(b==0)
	{
		return 1;
	}
	return a*calPowerSlow(a, b-1);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a and b");
       long a = in.nextLong();
       long b = in.nextLong();
       long startTime = System.nanoTime();
       System.out.println(calPower(a, b));
       long endTime = System.nanoTime();
       long duration = (endTime - startTime);
       System.out.println(duration);
       long startTime1 = System.nanoTime();
       System.out.println(calPowerSlow(a, b));
       long endTime1 = System.nanoTime();
       long duration1 = (endTime1 - startTime1);
       System.out.println(duration1);
      
		
		
		
	}

}
