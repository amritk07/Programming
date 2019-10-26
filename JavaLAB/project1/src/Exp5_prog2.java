import java.util.Scanner;
interface Cal{
	 void mul();
	 void add();
	 void sub();
	 void div();
	 void mod();
	
}
class CalImplement implements Cal{
	float a,b;
	Scanner input = new Scanner(System.in);
	void input()
	{
		System.out.println("Enter vlaue of a and b");
		a = input.nextFloat();
		b = input.nextFloat();
		
	}
	public void mul()
	{
		System.out.println("Result after mul:"+a*b);
	}
	public  void add()
	 {
		System.out.println("Result after add:"+(a+b));
	 }
	public  void sub()
	 {
		System.out.println("Result after sub:"+(a-b)); 
	 }
	public  void div()
	 {
		System.out.println("Result after div:"+(a/b));
	 }
	public  void mod() {
		System.out.println("Result after mod:"+(a%b));
		  }
	
	
}
public class Exp5_prog2 {
	public static void main(String[] args) {
		CalImplement i = new CalImplement();
		i.input();
		i.mul();
		i.add();
		i.sub();
		i.div();
		i.mod();
		
	}

}
