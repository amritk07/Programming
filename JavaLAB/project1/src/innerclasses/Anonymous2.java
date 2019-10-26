package innerclasses;
class Shape
{
	 static int r=10;
	 int k=0;
	void Area() {
		
	}
	
}
class Shape2 extends Shape
{
	Shape2()
	{
	System.out.println(Shape.r);
	System.out.println(k);
	}
}
class Shape3 extends Shape
{
	static void Shape3()
	{
		System.out.println(r);
		//System.out.println(k);//static cannot access non-static
	}
	
}
class Shape4 {
	
	static void Shape4()
	{
		System.out.println(r);
		System.out.println(k);
	}
	
	
}
public class Anonymous2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Shape s1 = new Shape()
    		   {
    	  public void  Area()
    	    {
    	    	System.out.print("Area of circle: "+3.14*r*r);
    	    }
    		};
    		s1.Area();
	}

}
