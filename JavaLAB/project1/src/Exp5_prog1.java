import java.util.Scanner;
interface test{
	
	void square();
	
}

class Airthmetic implements test{
	Scanner input = new Scanner(System.in);
	 public void square()
	{
		 
	  System.out.println("Enter a number");
	  int x  = input.nextInt();
	  System.out.println("Square of the no: "+x*x);
	}
}

public class Exp5_prog1 {

	public static void main(String[] args) {
		Airthmetic a = new Airthmetic();
		a.square();

	}

}
