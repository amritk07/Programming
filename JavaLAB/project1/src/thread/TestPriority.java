package thread;
class T1 extends Thread
{
	public void run()
	{
	for(int i = 1;i<=3;i++)	
	{
		System.out.println(0);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
	}
	}
}
class T2 extends Thread
{
	public void run()
	{
	for(int i = 1;i<=3;i++)	
	{
		System.out.println(1);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
	}
	}
}
class T3 extends Thread
{
	public void run()
	{
	for(int i = 1;i<=3;i++)	
	{
		System.out.println("2"+" "+Thread.currentThread().getPriority());
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
	}
	}
}
public class TestPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		T1 a = new T1();
		T2 b = new T2();
		T3 c = new T3();
		
		c.setPriority(Thread.MAX_PRIORITY);
		b.setPriority(1);
		a.setPriority(10);
		
		a.start();
		b.start();
		c.start();
		
	}

}
