package recursionAndBackTracking;

public class SortedArrayUsingRecursion {

	public static boolean isSorted(int[] a,int n)
	{
		
		if(n==1)
		{
			return true;
		}
		if(a[n-2]<=a[n-1])
		
		{
			if(isSorted(a,n-1))
			return true;
		}
		
			return false;
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int arr[] = {1,2,3,3,4,5,6,9,8};
		int n = arr.length;
		if(isSorted(arr, n))
		{
			System.out.println("Yes Sorted");
		}
		else {
			System.out.println("Not sorted");
		}
		
		
		
	}

}
