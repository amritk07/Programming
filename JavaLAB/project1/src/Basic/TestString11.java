package Basic;

import java.util.Scanner;

public class TestString11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter");
		String s2 = s1.nextLine();
		String[] s3 = s2.split(" ");
		for(int i =0;i<s3.length;i++)
		{
			System.out.println(s3);
		}
 		
	}

}
