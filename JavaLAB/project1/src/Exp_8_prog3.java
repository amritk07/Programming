//3)	Write a program in Java to read a statement from console, 
// convert first letter of each word  into upper case and again print on console. (Don’t use inbuilt function
import java.util.Scanner;
public class Exp_8_prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new  Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = input.nextLine();
		String[] s2 = s1.split(" ");
		int ascii;
		for(int i=0;i<s2.length;i++)
		{
		  char[] c1 = s2[i].toCharArray();
		  for(int j=97;j<=122;j++)
		  {
			  ascii=0;
			  if(c1[0]==j)
			  {
				ascii =j-32;
				c1[0]=(char)ascii;
				
			 }
		     
		  }
		  String s3 = new String(c1);
		  System.out.print(s3+" ");
		}
		
       
	

} }
