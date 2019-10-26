package basic;
import java.util.*;
public class Hacker2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of student and lucky number");
		int n=  in.nextInt();
		int k = in.nextInt();
		int arr[] = new int[n];
		int count=0;
		for(int l =0;l<arr.length;l++)
		{
		 arr[l] = in.nextInt();
		}
		for(int i =0;i<arr.length;i++)
		{
			 //count =0;
			for(int j =i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==k)
				{
					count++;
				
				}
			}
		}
		System.out.println(count);
	}
}
