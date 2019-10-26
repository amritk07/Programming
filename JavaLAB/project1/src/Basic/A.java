package Basic;


import java.util.Scanner;
class NonNumericException extends Exception {
	 void nonnumeric(String s1,String s2) { }
		 void tostring()
		{
			System.out.println( "Non-numeric Exception");
		}
	
}
class CreateException  {
	
	void nonnumeric(String a,String b) throws NonNumericException
	{
		char[] ch1= a.toCharArray();
		char[] ch2=b.toCharArray();
		 boolean b1, b2;
		for(int i=0;i<ch1.length;i++)
		{
			
			
				 b1 = Character.isDigit(ch1[i]);
				 if(b1==false)
				 {
					 throw new NonNumericException();
				 }
		}
				for(int j=0;j<ch2.length;j++)
				{
					b2 = Character.isDigit(ch2[j]);
					 if(b2==false)
					 {
						 throw new NonNumericException();
					 }
				     
				}
				int a1 = Integer.parseInt(a);
				int a2 = Integer.parseInt(b);
				int c = a1%a2;
				System.out.println("Result: "+c);
					
		} }
/*	void getInput() throws NonNumericException
	{
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter first number: ");
		 String n1 = input.next();
		 System.out.print("Enter Second number: ");
		 String n2 = input.next();
		 nonnumeric(n1,n2);
		 
	}
	
	}*/
	


public class A {
	static String n1 = "2";
	static String n2="3";
	static int i;
	
	public static void  main(String a[]) {

		//String n1;
		//String n2;
		CreateException n = new CreateException();
		try
		{
			n.nonnumeric(n1,n2);
			}
		catch(NonNumericException e) {
			
			System.out.println("Operand is incorrect");
			
		}
		System.out.println(i);
		i = 1;
		System.out.println(i);
	}
}

