class A7 extends Thread

{
	public void run()
	{
		
		for(int i = 0;i<5;i++)
		{
			System.out.println("Extending thread class: "+i);
			try
			{
				Thread.sleep(1000);
			}
		   catch(Exception e)
		   {
		}
		
	}
	
	
} }
class Mythread1 implements Runnable
{    
	@Override
	public void run() {
		for(int i = 0;i<5;i++)
		{
			System.out.println("Runnable interface: "+i);
			try
			{
				Thread.sleep(1000);
			}
		   catch(Exception e)
		   {
		}
		
	}
	
} }
public class Exp_9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.out.println("The name is "+Thread.currentThread().getName()+" Id : "+Thread.currentThread().getId());
	
	 Thread t1 = new Thread(new Mythread1());
	 t1.start();
	 A7 a1 = new A7();
	 a1.start();
			
	}

	
	
	
}