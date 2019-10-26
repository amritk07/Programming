package Basic;
class Shape
{
	void draw()
	{
		System.out.println("drawing....");
	}
	
	
}
class Circle extends Shape
{
	void  draw()
	{
		System.out.println("drawing circle...");
	}
	
}

class Rectangle extends Shape
{
	void  draw()
	{
		System.out.println("drawing rectangle...");
	}
	
}



public class RuntimePolymorphsm {
public static void main(String[] args) {
		// TODO Auto-generated method stub
      Shape s1;
      
      s1 = new Circle();
      s1.draw();
      s1 = new Rectangle();
      s1.draw();
	}

}
