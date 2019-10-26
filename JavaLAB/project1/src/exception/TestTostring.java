package exception;
import java.util.*;
class OperandException extends Exception
{
	public String toString()
	{
		return "OperanException";
	}
}
class TestException1
{
	void sum(String a, String b) throws OperandException
	{
	 	boolean b1,b2;
	 	b1 = Character.isDigit(a.charAt(0));
	 	b2 = Character.isDigit(b.charAt(0));
	 	if(b1==false||b2==false)
	 	{
	 		throw new OperandException();
	 	}
	 	else 
	 	{
	 		int a1 = Integer.parseInt(a);
	 		int a2 = Integer.parseInt(b);
	 		System.out.println("Result: "+ (a1/a2));
	 	}
	}
}
public class TestTostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String a = args[0];
		//String b = args[1];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter operands for division ");
		String a = in.next();
		String b = in.next();
		TestException1 t1 = new TestException1();
		
		try {
			t1.sum(a,b);
		} catch (OperandException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print(e);
		}

	}

}
