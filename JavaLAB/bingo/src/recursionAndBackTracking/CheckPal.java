package recursionAndBackTracking;

import java.io.*;



public class CheckPal {
	//static int  count = 1;
	static boolean b1 = true;
	public static boolean check(char ar[], int n, int t )
	{
		if(n==t)
		{
			return b1;
		}
		
		if(ar[n]!=ar[t-1])
		{
			b1 = false;
			
		}
		
		if(n<t)
		{
			return check(ar, n+1, t-1);
		}
		
		
		return b1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      
      InputStreamReader r=new InputStreamReader(System.in);    
      BufferedReader inp=new BufferedReader(r);
      try {
		
    	    String s = inp.readLine();
    	     char arr[] = s.toCharArray();
	
	    	 if(check(arr, 0, arr.length))
	    	 {
	    		 System.out.println("YES");
	    	 }
	    	 else {
	    		 System.out.println("NO");
		    	 
			}
	    	 
	      
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
