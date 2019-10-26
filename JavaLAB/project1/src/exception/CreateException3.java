package exception;

import java.util.Scanner;
 class Array {
	Scanner input = new Scanner(System.in);
	String n[]= {"Amrit","Anant","Ankit","Amar"};
	int roll[]= {1,2,3,4};
	void get()
	{
		
	for(int i=0;i<=n.length;i++)
	{
		System.out.println(n[i]);

}
}
 }

public class CreateException3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array a1 = new Array();
try {
		a1.get();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	//a1.get();
	}

}
