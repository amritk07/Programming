package Basic;

public class Local {
 
	private int data = 10;
	void display()

	{
		
		class Inner{
			
			void msg()
			{
			System.out.println("Inside method"+" "+data);
			}
			
		}
		Inner  i = new Inner();
		i.msg();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Local l1 = new Local();
		l1.display();
		
	}

}
