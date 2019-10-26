package thread;
class Dead
{
	public synchronized void d1(Lock l)
	{
		System.out.println("THread 1 starts execution of d1() method");
		try
		{
			Thread.sleep(1000);
		}
	   	catch(InterruptedException e)
	   	{
	   		System.out.println("Thread 1 trying to call lock,s last method");
	   		l.last();
	   	}
		
		
	}	
	public synchronized void last()
	{
		System.out.println("Inside Dead");
	}
	
}

class Lock
{
	public synchronized void d2(Dead d)
	{
		System.out.println("THread 2 starts execution of d2() method");
		try
		{
			Thread.sleep(1000);
		}
	   	catch(InterruptedException e)
	   	{
	   		System.out.println("Thread 2 trying to call dead,s last method");
	   		d.last();
	   	}
		
		
	}	
	public synchronized void last()
	{
		System.out.println("Inside Lock");
	}
	
}

public class TestDeadlock extends Thread{
	Dead d = new Dead();
	Lock l1 = new Lock();
  public void m()
    {
	  this.start();
	  d.d1(l1);
    }
  public void run()
  {
	  l1.d2(d);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		TestDeadlock t1 = new TestDeadlock();
		t1.m();
		
	}

}
