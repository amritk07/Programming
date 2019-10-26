package basic;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = {2,2,1,3};
       int n = arr.length;
       int count[] = new int[n+1];
   	int count1 =0;
   	List<Integer> l1 = new ArrayList<Integer>();
	for(int i =1;i<=n;i++)
	{   count1 =0;
		for(int j = 0;j<n;j++)
		{
			if(arr[j]==i)
			{
				count1++;
			}
			if(!l1.contains(arr[j]))
			{
				l1.add(count1);
				count[i] = count1;
				
			     
		    }
	}
	}
		
		for(int i = 1;i<=n;i++)
		{
			System.out.print(i+" ");
		}
		
      System.out.println("\n");
      for(int i = 1;i<count.length;i++)
		{
			System.out.print(count[i]+" ");
		}

}

}
