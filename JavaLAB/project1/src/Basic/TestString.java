package Basic;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter");
		String s2 = s1.next();
		char[] c1 = s2.toCharArray();
		int ascii = c1[0];
		for(int i= 97 ;i<123;i++)
		{
			if(ascii==i)
			{
			   String s4 = new String(c1);
			   String s5  = s4.toUpperCase();
			   //System.out.println(s5);
			   c1[0] = s5.charAt(0);
			}
		}
		String s3 = new String(c1);
		System.out.println(s3);
		
		
	}

}
