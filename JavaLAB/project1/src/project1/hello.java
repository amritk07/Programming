package project1;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("HEllO WORLD");
	}

}
interface test
{
	int square();
}

class arithmetic implements test
{
	int b;

	arithmetic(int x)
	{
		b = x;
	}

	public int square()
	{
		return (b*b);
	}
	
}
class ToTestInt
{
	public int return_ans(int x)
	{
		aritmetic a=new arithmetic(x);
		return a.square();
	}
}
class main_class
{
	public static void main(String []args)
	{
		ToTestInt x= new ToTestInt();
		System.out.println("\nThe square of 64 is "+x.return_ans(64));
	}
}