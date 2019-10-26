import java.util.Scanner;
interface Shape{
	
	float Pi = 3.14f;
	
	void  Area();
	
} 
class Circle implements Shape{

	Scanner input = new Scanner(System.in);
	
	public void Area() {
		System.out.println("Enter radius: ");
		float r = input.nextFloat();
		System.out.println("Area of the circle: "+Pi*r*r);
		
	}
	
	
	
}
public class Exp5_prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle c = new Circle();
c.Area();
	}

}
