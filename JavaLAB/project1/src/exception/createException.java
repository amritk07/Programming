package exception;
class Divide
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


}
	
}
public class createException {
	public static void main(String args[])
	{
		Divide d = new Divide();
		try {
		d.divideByzero();// try can throw only one exception.
		d.nullPointer();
		}
	catch(Exception e)
	{
		System.out.println(e);// this is exception throw by catch block which comes first
		e.getCause();//get cause of this throwable exception
		e.printStackTrace();// trace path of all path exception handling.
	}

}}
