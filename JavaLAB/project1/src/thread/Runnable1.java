package thread;
class Aq
{
	int k = 10;
	public void hello()
	{
		
	}
}
class TestRun extends Aq implements Runnable 
{
	public void run()
	{
		System.out.println("Runnable interface");
	}
	public void hello()
	{
		System.out.println("Inheritance: "+k);
	}
}
public class Runnable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TestRun a1 = new TestRun();
      Thread t1 = new Thread(a1);
      a1.hello();
      t1.start();
	}

}
