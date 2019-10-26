package exception;
import java.util.*;
class DifferentDirectionException extends Exception{
	/*DifferentDirectionException(String d)
	{
		super(d);
	}*/
	public String toString()
	{
		return "DifferentDirectionException";
		
	}
	
	
	
}
 class TestException11 {
  void test(String d1,String d2) throws DifferentDirectionException
  {
	  if(d1.equals(d2))
	  {
		  System.out.println("No collision");  
	  }
	  else
	  {
		  
		  throw new DifferentDirectionException();
	  }
		  
	  
  } 
 }
 public class TestException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in = new Scanner(System.in);
      System.out.println("Enter first direction");
      String s1 = in.next();
      System.out.println("Enter second direction");
      String s2 = in.next();

      TestException11 t1 = new TestException11();
      try {
       t1. test(s1,s2);
	}
    catch(DifferentDirectionException e)
    {
    	
    }
	
	
	}

}
