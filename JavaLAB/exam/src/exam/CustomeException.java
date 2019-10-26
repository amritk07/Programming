package exam;
import java.util.*;



//import exam.Myexception.CreateMyexception;
class Myexception extends Exception{
	{	
		public String tostring()
		{
		return "DifferentDirectionException";	
		}
	}
}
class CreateMyexception
{
	Scanner snScanner = new Scanner(System.in);
	public void createMyexception() throws Myexception
	{
		
		System.out.println("Enter");
		int i = snScanner.nextInt();
		if(i==5)
		{
			throw new Myexception();
		}
		else {
			System.out.println(i);
		}
	}
}
	

public class CustomeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CreateMyexception c1 = new CreateMyexception();
        try {
			c1.createMyexception();
		} catch (Myexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
