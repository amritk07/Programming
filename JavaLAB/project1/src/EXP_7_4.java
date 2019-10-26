import java.util.Scanner;

class DifferentDirectionException extends Exception {
public String toString()
{
return "DifferentDirectionException";	
}
}
class TestException
{
	TestException(String s1,String s2) throws DifferentDirectionException
	{
		if(s1.equals(s2))
		{
			System.out.println("No collision");
		}
		else 
		{
			throw new DifferentDirectionException();
		}
	}
}

public class EXP_7_4 {
public static void main(String args[])
{
	Scanner input = new Scanner(System.in);
	String d1,d2;
	System.out.println("Enter direction for first vehicle");
	d1 = input.next();
	System.out.println("Enter direction for second vehicle");
	d2 = input.next();
	try {
	TestException t1 = new TestException(d1,d2);
	
}
	catch(DifferentDirectionException e)
	{
		System.out.println("Collision");
	}
	
}
}
