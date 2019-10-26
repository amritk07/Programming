package exam;
class Money
{
	int n = 10000;
public synchronized void withdraw(int n)	
{
	if(this.n<n)
	{
		System.out.println("Less balance....waiting for withdraw");
		
		try {
			wait();
		} catch(Exception e) {}
		
	}
	this.n = this.n-n;
	System.out.println("Withdraw completed");
}
public synchronized void deposite(int n) {
	System.out.println("going to deposite");
	this.n = this.n + n;
	System.out.println("Deposited");
	notify();
}
}


public class TestNotify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  final Money m1 = new Money();
		new Thread()
		{
			public void run()
			{
				m1.withdraw(500000);
			}
			
		}.start();
		new Thread()
		{
			public void run()
			{
				m1.deposite(50000000);
			}
			
		}.start();
		
		
		
	}

}
