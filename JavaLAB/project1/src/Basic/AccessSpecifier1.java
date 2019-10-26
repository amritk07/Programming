package Basic;
 class  A7
{
	int d = 10;
	public int k =10;
	protected int p =18;
}
 class B7 extends A7

{    B7()
	{
	System.out.println(d);//both can access and inherit.
	System.out.println(k);//both can access and inherit.
	}
}
public class AccessSpecifier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      B7 b1 = new B7();
      
	}

}
