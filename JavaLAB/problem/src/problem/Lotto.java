package problem;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		int[] a = {1,2,3,4,5,6,7,8,10,12};
		int n = a.length;
	    for(int i = 0;i<n-5;i++)
	    {
	    	for(int j = i+1;j<n-4;j++) {
		    
		    	
	    	
	    	   for(int k = j+1;k<n-3;k++) {
		    
		    
	    	          for(int l = k+1;l<n-2;l++) {
		    
		                     for(int m = l+1;m<n-1;m++) {
		                    	 
		                    	 for(int o = m+1;o<n;o++){
		                    	 
		                    	 System.out.println(a[i]+","+a[j]+","+a[k]+","+a[l]+","+a[m]+","+a[o]);
		                    	 
		                    	 
		                    	 
		                    	}
		                    }
		                  }
		              }
		        }
	    }
}
catch(Exception e)
{
	
	e.printStackTrace();
}
	}

}
