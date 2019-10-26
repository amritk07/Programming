import java.util.Scanner;
class NonNumericException extends Exception {
	static void nonnumeric(String s1,String s2) { }
		public  String tostring()
		{
			return "Non-numeric Exception";
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
					
		}
	/*void getInput() throws NonNumericException
	{
		/* Scanner input = new Scanner(System.in);
		 System.out.println("Enter first number: ");
		 String n1 = input.next();
		 System.out.print("Enter Second number: ");
		 String n2 = input.next();
		 String n1 = null,n2 = null;
		 nonnumeric(n1,n2);
		 
	}*/
	
	}
	



public class Exp_7_3 {
	
	
	public static void  main(String a[])  {
    String n1 = a[0];
    String n2 = a[1];
		
		CreateException n = new CreateException();
		try
		{
			n.nonnumeric(n1,n2);
			
		}
		catch(NonNumericException e) {
			
			System.out.println("Operand is incorrect");
			
		}
		System.out.println();
	}
}
