package Basic;
class AAA
{
   public void display()
   {
	   System.out.println("hello");
   }
   public void display(int i)
   {
	   System.out.println(i+12);
   }
	
}
public class PolyMorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          AAA a1 = new AAA();
          a1.display();
          a1.display(12);
	}

}
