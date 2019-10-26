package exception;
//***nested try block*** when we need to handle more than one exception.
class Divide2
{
void divideByzero()
{
	int i = 10;
	int j = 0;
	int a = i/j; //unchecked exception - not handled at compile time.
}

void nullPointer()
{
String s = null;
int i = s.length();


} }


public class CreateExeption2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Divide2 d = new Divide2();
          try
          {
          try {
        	  d.divideByzero();
        	  }
          catch(ArithmeticException e)
    	  {
    		  System.out.println(e);
    		  System.out.println("This is ArithmeticException" );
    	  }
        	  try {
        		  d.nullPointer();
        		  }
        	 
        	  catch(NullPointerException e)
        	  {
        		  System.out.println(e);  
        		  System.out.print("This is NullPointerException" );
        	  }
        	  
          }
          catch(Exception e) 
          {
        	  
          }
        	  
           }

}

