package Basic;


public class OuterClass1 {

	private int i = 10;
	
	class InnerClass
	{
		void msg()
		{
			System.out.println("Inner"+i);
			
		}
	}
	public static void main(String args[]) {
		OuterClass1.InnerClass a1 = new OuterClass1().new InnerClass();
		a1.msg();
		
	}
}
