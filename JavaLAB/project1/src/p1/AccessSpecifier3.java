package p1;
import Basic.*;
class D extends Ac
{
  D()
  {
	 
		System.out.println(k); // public can be both access and inherited in different package
		//System.out.println(d); default cannot
		System.out.println("protected: "+p);
  }
	
	
}
class E
{ 
	Ac a1 = new Ac();
	E()
	{
		System.out.println(a1.k);
		//System.out.println("Protected: "+a1.p);only access in child class
	}
}
public class AccessSpecifier3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       D d1 = new D();
	}

}
