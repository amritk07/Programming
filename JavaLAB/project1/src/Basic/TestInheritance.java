package Basic;
class A13
{
	int b =10;	
}

class B14
{
	A13 a = new A13();
	void d()
	{
		System.out.println("b: "+a.b);
	}
	void d1()
	{
		a.b=13;
		System.out.println("b: "+a.b);
	}
}
class C15 extends A13
{
	C15()
	{
		System.out.println("Inherited class");
	}
	void d()
	{
		System.out.println("a: "+b);
	}
	void d1()
	{
		b=13;
		System.out.println("b: "+b);
	}
}
public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		B14 b1 = new B14();
		b1.d();
		b1.d1();
		C15 c1 = new C15();
		c1.d();
		c1.d1();
		
	}

}
