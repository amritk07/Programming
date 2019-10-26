package recursionAndBackTracking;
import java.util.*;
public class RecursiveDigitSum {
	 static int superDigit(String n, int k) {
		  int num = Integer.parseInt(n);
		if(k>0)
		{
		
		if(num>0&&num<=9)
		{
			return num;
		}
		if(num>=10)
		{
		  num = calculate(num);
		 	
		 String num1 = String.valueOf(num);	
		 return superDigit(num1, k-1);	
		}
	      
		}
		return num;
	       
        
        

    }
	private static int calculate(int num) {
		// TODO Auto-generated method stub
		int sum = 0;
		int temp = num;
		while(temp>0)
		{
			temp= num%10;
			sum = sum + temp;
			num = num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		String n = in.nextLine();
		//in.nextLine();
		System.out.println("Enter k");
		
		int k =in.nextInt();
		int result = superDigit(n, k);
		//int result = calculate(Integer.parseInt(n));
		System.out.println(result);
		
		
		
		
		
		

	}

}
