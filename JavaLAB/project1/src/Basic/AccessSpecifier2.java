package Basic;
class Z7 extends A7

{
	Z7()
	{
		System.out.println(k);//public member can be both inherited and access in same package
		System.out.println("Default: "+d);//default member can be both inherited and access in same package
		System.out.println(p);
	}
	
}
class S
{
	A7 z = new A7();
	S()
	{
		System.out.println(z.k);
		System.out.println(z.p);
	}
}
public class AccessSpecifier2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Z7 a = new Z7();
       S d = new S();
	}

}
