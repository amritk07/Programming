package problem;

import java.util.Scanner;

public class Decimal {
	static void plusMinus(int[] arr) {

		int l = arr.length;
		float c1 =0f;//positive
	    float c2 =0f;//negative
		float c3 =0f;//zero
		for(int i =0;i<l;i++)
		{
			if(arr[i]>0)
			{
				c1++;
			}
			else if(arr[i]<0)
			{
				c2++;
			}
			else if(arr[i]==0)
			{
				c3++;
			}
		}
	double	c4 = (c1/l);
	double	c5 = (c2/l);
	double	c6 = (c3/l);
	System.out.print(c4+"\n"+c5+"\n"+c6);

    }

   // private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//int n = scanner.nextInt();
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int n = Integer.parseInt(args[0]);
        int[] arr = new int[n];

   
        // System.out.println("Enter element");
        int k =1;
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(args[k]);
            arr[i] = arrItem;
           k++;
        }
         
        plusMinus(arr);

       // scanner.close();
		
	}

}
