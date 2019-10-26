package thread;
class MyThread extends Thread
{
	MyThread(String name)
	{
		super(name);
	}
	
	public void run()
	{
		System.out.println("The name is "+Thread.currentThread().getName()+" Id : "+Thread.currentThread().getId());
	}
}

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The name is "+Thread.currentThread().getName()+" Id : "+Thread.currentThread().getId());
   // MyThread t1 = new MyThread("subthread");
   // t1.start();
    for(int i=0;i<5;i++)
    {
    	 MyThread t1 = new MyThread("subthread " +i);
    	    t1.start();
    }
	}

}
