import java.util.Scanner;
class A6
{
	Scanner input = new Scanner(System.in);
	void input1() {
	System.out.println("Enter String");
	String s1 = input.nextLine();
	convert(s1);
	}
	void convert(String s1)
	{
		
		char[] arr = s1.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
		  for(int j=96;j<=121;j++)
		  {
			 if(arr[i]==j)
			 {
			  int ascii = arr[i];
			  ascii = ascii-32;
			  arr[i]= (char)ascii;
				
			  
			 }
		  }
		 
		  
		}
		String s3 = new String(arr);
		System.out.println(s3);
		 
	}
}
public class Exp_8_prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      A6 a1 = new A6();
       a1.input1();
	}

}
