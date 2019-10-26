package exam;
class Child extends Thread
{
	
	public void run()
	{
		System.out.println("Child thread");
	}
	
}
public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Child c1 = new Child();
       Child c2 = new Child();
       Child c3 = new Child();
       c1.start();
       c2.start();
       c3.start();
       try {
		c1.join();
		c2.join();
		c3.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      System.out.println(Thread.currentThread().getName());
       
	}

}
