package innerclasses;
class Outer
{
	int k =7;
	class Inner{
		
		void showInner()
		{
			System.out.println("Inner: "+k);
		}
	}
		void showOuter()
		{
			System.out.println("Outer: "+k);
		}
	
	
}
public class NestedInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer t1 = new Outer();
		t1.showOuter();
       Outer.Inner in = new Outer(). new Inner();
       in.showInner();
       
	}

}
