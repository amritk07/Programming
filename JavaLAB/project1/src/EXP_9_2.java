class Even extends Thread
{
	int n;
	Even(int n)
	{
	 this.n = n;	
	}
	
	public void run()
	{
	  for(int i=2;i<=n;i++)	
	 {
		if(i%2==0)
		{
			System.out.println("Even "+i);
		}try
		{
			Thread.sleep(1000);
		}
	   catch(Exception e)
	   {
		
	   }
		
	}
	
	
}
}
class Odd extends Thread
{
	int n;
	Odd(int n)
	{
	 this.n = n;	
	}
	
	public void run()
	{
	  for(int i=2;i<=n;i++)	
	 {
		if(i%2==1)
		{
			System.out.println("Odd "+i);
		}try
		{
			Thread.sleep(1000);
		}
	   catch(Exception e)
	   {
		
	   }
		
	}
	
	
}
}
public class EXP_9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Even t1 = new Even(10);
      Odd t2  = new Odd(10);
      t1.start();
      t2.start();
      
	}

}
