//***multiple catch block***
package exception;
class Divide1
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
public class CreateException1 {

	public static void main(String[] args) {
		Divide1  d= new Divide1();
     try {
    	 d.divideByzero();
    	 d.nullPointer();// don't execute
    	 }
     //--sometimes we don't know which type of exception is going to occur, for that purpose we need multiple catch block.
     //****whenever any exception occur at try block corresponding catch block will be invoke.****
     catch(ArithmeticException e)
     {
    	 System.out.print(e);
     }
     catch(NullPointerException e)
     {
    	 System.out.print(e);
     }
     catch(Exception e)// it is general type, catch all type of exception ***always declare it last
     {
    	 System.out.print(e);
     }
     
	}

}
