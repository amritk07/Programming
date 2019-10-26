//Write a Java program to show that private member of a super class cannot be accessed from derived classes



class Dimension{
 private int length = 10; //private member
int width = 20;
	
}
class Area extends Dimension{
	void display() {
	
	System.out.print("AREA OF RECTANGLE: "+(length*width));
	
	
}
}

public class Private {

	public static void main(String[] args) {
   Area a = new Area();
   a.display();
	}

}
