package Basic;
class Ib
{
	static int b = 10;
	
	
}
class Fbi
{
  void a()
  {
	  System.out.println(Ib.b);//non-static can access static
  }
  static void a1()
  {
	  System.out.println(Ib.b);
  }
	
}
class Csi extends Ib
{
	void a()
	  {
		  System.out.println(b);
	  }
	  static void a1()
	  {
		  b = 12;
		  System.out.println(b);
	  }
}

public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Fbi f1 = new Fbi();
		f1.a();
		f1.a1();
		Csi c1 = new Csi();
		c1.a();
		c1.a1();
	}

}
