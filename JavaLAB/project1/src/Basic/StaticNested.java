package Basic;

public class StaticNested {

	private static int i =10;
	static class Inner
	{
		void msg()
		{
			System.out.println("Static Inner"+" "+10);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticNested.Inner a1 = new StaticNested. Inner();
		a1.msg();
		
		
	}

}
