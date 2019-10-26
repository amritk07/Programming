package Basic;
abstract class AAAA
{
	
	abstract void display();
	void print()
	{
		System.out.println("hello");
	}
}
class BBB extends AAAA{
	public void display()
	{
		System.out.println("This abstarct class method");
	}

	
	
}
public class Abstract  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BBB a1 = new BBB();
		a1.display();
		a1.print();
		
		
	}

}
