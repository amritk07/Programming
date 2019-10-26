package string;
abstract class A
{
	A()
	{
		System.out.println("Hello");
	}
	abstract void display();
}
 class B extends A
{
	 B()
	 {
		 super();
	 }
	public void display()
	{
		System.out.println("Hello again");
	}
}
public class TestString {
public static void main(String args[])
{
	String s1 = "hello";
	String s2 = "hello";
	System.out.println(s1==s2);//output true
	String s3 = new String("hello");
	String s4 = new String("hello");
	System.out.println(s3==s4);//output false : why?
	System.out.println(s1.equals(s2));//output true
	System.out.println(s1.equals(s2));//output true.
	B b1 = new B();
	b1.display();
	
}
}
