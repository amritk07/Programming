package recursionAndBackTracking;

import java.util.HashMap;
import java.util.Map;

public class Memoziation {
    static Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
	public static int calFib(int n)
	{
		if(n==0) 
			{return 0;}
		if(n==1) { return 1;}
		if(m1.containsKey(n))
		{
			return m1.get(n);
		}
		
		int result = calFib(n-1) + calFib(n-2);
		m1.put(n,result);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		System.out.println(calFib(6));
		
		
	}

}
