
class Print
{
	String s1="I";
	String s2="Love";
	String s3="UPES";
	int count=0;
	synchronized void printI()
	{
		while(count!=0)
		{

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(s1);
		count=1;
		notifyAll();
		
		
	}
	synchronized void printLove()
	{
		while(count!=1)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(s2);
		count=2;
		notifyAll();
		
		
	}
	synchronized void printUpes()
	{
		while(count!=2)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(s3);
		count=0;
		notifyAll();
		
	}
}
public class Producer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Print objPrint=new Print();
		new Thread() {
			public void run()
			{
				while(true)
				{
					objPrint.printI();
				}
			}
			
		}.start();
		new Thread() {
			public void run()
			{
				while(true)
				{
					objPrint.printI();
				}
			}
			
		}.start();
		new Thread() {
			public void run()
			{
				while(true)
				{
					objPrint.printLove();;
				}
			}
			
		}.start();
		new Thread() {
			public void run()
			{
				while(true)
				{
					objPrint.printUpes();
				}
			}			
		}.start();

	}

}
 