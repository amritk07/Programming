package problem;
import java.util.*;
public class DiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter n");
		int n = in.nextInt();
		System.out.println("Enter element of square matrix of size: "+ n);
		int[][] arr = new int[n][n];
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<n;j++)
			{
				
				
				arr[i][j] = in.nextInt();
			}
			
		}
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<n;j++)
			{
				
				
				System.out.print(arr[i][j]+ " ");
			}
			System.out.print("\n");
			
		}
		//The primary diagonal
	    int  d1 = 0;
		for(int i =0;i<n;i++)
		{
		   
			   d1 = arr[i][i] + d1;
		 }
		System.out.println("Sum of primary diagonal: "+d1);
		//the secondary diagonal
		 int  d2 = 0;
		 int k = 0;
		for(int i = n-1 ;i>=0;i--)
		{
			   
		  d2 = arr[k][i] + d2;
		 // System.out.println(i + " "+ k);
		  k++;
		 }
			System.out.println("Sum of secondary diagonal: "+d2);
		int sum =0;
		sum = d1 + d2;
		if(sum>0)
		{
			System.out.println("Final Sum: "+sum);
			
		}
		else {
			System.out.println("Final sum: "+ -1 * sum);
		}
		System.out.println(arr.length);
		
		
		
	}

}
