package bingo;
import java.util.*;
public class Tprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<arr.length;i++)
		{
			arr[i] = in.nextInt();
		}
		in.close();
		int count =0;
		
		for(int  i = 0;i<arr.length;i++)
		{
			count =0;
			for(int k = 2; k<=arr[i];k++)
			{
				if(arr[i]%k==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			    }
			
		}
		
		

	}

}
