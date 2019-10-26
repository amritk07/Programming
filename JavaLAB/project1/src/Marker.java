class A3 implements Cloneable
{
	int i;
	String s;
	A3(int i, String s)
	{
		this.i = i;
		this.s = s;
	}
	protected Object clone()
			throws CloneNotSupportedException 
    { 
        return super.clone(); 
    } 
} 

public class Marker {
 
	public static void main(String args[])
	
		throws CloneNotSupportedException
		{
		A3 a = new A3(30,"OSS");
		try {
		A3 b = (A3)a.clone();
		System.out.println(b.i+a.i); }
		
		catch(Exception e)
		{
			System.out.print(e);
		}
		
		
		
	}
	
	
	
	
	
	
}
