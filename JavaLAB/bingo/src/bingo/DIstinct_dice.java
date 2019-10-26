package bingo;
import java.util.*;
public class DIstinct_dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
		System.out.println("Enter t");
		int t = in.nextInt();
		while(t>0)
		{
			System.out.println("Enter");
			int n = in.nextInt();
			double ans = 0;
			for(int i =1;i<=n;i++)
			{
				ans += n/(i*1.0);
			}
			System.out.println(Math.round(ans*100)/100.00);
			t--;
		}
		
		
		
		
		
	}

}
