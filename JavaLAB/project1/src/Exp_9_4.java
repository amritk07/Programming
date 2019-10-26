class B1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(1);
			
		
	}
	}
	
}
class B2 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(2);
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
class B3 extends Thread
{
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(3);
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
class B4 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(4);
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
class B5 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(5);
			
	}
	
} }
public class Exp_9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B1 t1 = new B1();
B2 t2 = new B2();
B3 t3 = new B3();
B4 t4 = new B4();
B5 t5 = new B5();
t1.setPriority(t1.MAX_PRIORITY);
t5.setPriority(t5.MAX_PRIORITY);
t1.start();
t5.start();
t2.start();
t3.start();
t4.start();
	}

}
