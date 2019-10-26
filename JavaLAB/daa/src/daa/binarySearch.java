package daa;

public class binarySearch {
public static int  sorted(int arr[] ,int k,int s,int n) //only n sorted array
{
	int m = (s+n)/2;
	if(m>n)
	{
		return -1;
	}
	if(arr[m]==k)
	{
		return m;
	}
	if(arr[m]<k)
	{
		return sorted(arr, k, m+1, n);
	}
	if(arr[m]>k)
	{
		return sorted(arr, k, s, m-1);
	}
	
	return 0;
    
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int arr[] = {1,2,4,6,8,13,15,16};
           int n = arr.length;
          int result= sorted(arr,116,0,n);
          System.out.println(result);
	}

}
