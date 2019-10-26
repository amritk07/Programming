package thread;
class Consumer
{

	String s1 = "i";
	String s2 = "Love";
	String s3 = "Upes";
	int count =0;
	synchronized public void printI() {
		// TODO Auto-generated method stub
		while(count!=0)
		{
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("i");
		count = 1;
		notifyAll();
	}

	synchronized public void printLove() {
		// TODO Auto-generated method stub
		while(count!=1)
		{
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("Love");
		count = 2;
		notifyAll();
	}

	synchronized public void printUpes() {
		// TODO Auto-generated method stub
		while(count!=2)
		{
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("Upes");
		count = 0;
		notifyAll();
	}

	
	
	
	
	
}
public class Producer11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		final Consumer c1 = new Consumer();
		new Thread() {
			public void run()
			{
			while(true)
			{
				c1.printI();
			}
			
			}
		}.start();
		
		new Thread() {
			public void run()
			{
			while(true)
			{
				c1.printLove();
			}
			
			}
		}.start();
		new Thread() {
			public void run()
			{
			while(true)
			{
				c1.printUpes();
			}
			
			}
		}.start();
		
	}

}
