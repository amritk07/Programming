package Basic;
abstract class A1
{
 // abstract	int b=19; not possible
abstract  void display();
	
}
abstract class B23
{
	//private int h=10;
}
public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     A1 a1 = new A1()
    		 {

				@Override
				 void display() {
					// TODO Auto-generated method stub
					System.out.println("Hello abstract");
				}

    	 	 };
    	 	a1.display();
	}   
}
