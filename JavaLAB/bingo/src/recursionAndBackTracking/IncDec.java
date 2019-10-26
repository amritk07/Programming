package recursionAndBackTracking;

public class IncDec {
public static void inc(int a,int b)
{
	if(a==b)
	{
		System.out.println(b);
	}
	else {
		
	
	System.out.println(a);
	inc(a+1, b);
	}
}
public static void dec(int b,int a)
{
	if(b==a)
	{
		System.out.println(a);
	}
	else {
		
	
	System.out.println(b);
	inc(b-1,a);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			inc(1, 10);
			System.out.println("Border");
			dec(20, 2);
		} catch (Exception e) {
		                    
			
			
			// TODO: handle exception
		}
		
		
	}

}
