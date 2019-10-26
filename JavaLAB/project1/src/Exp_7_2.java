import java.util.Scanner;
class Divide
{
	
void divideByzero(int a, int b)
{
	
	int result = a/b;
	System.out.println("Result: "+result);
}

}

public class Exp_7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any two nos.");
		int a = input.nextInt();
		int b = input.nextInt();
		Divide d = new Divide();
		try {
		d.divideByzero(a,b);
		
		}
	catch(Exception e)
	{
		System.out.println("Divide by zero is not possible");
		
	}
	}

}
