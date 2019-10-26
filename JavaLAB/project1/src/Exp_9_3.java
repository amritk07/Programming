class Increments
{
 int count=0;
 synchronized void increase()
 {
	 System.out.println(++count);
	 
	 try
		{
			Thread.sleep(600);
		}
	   catch(Exception e)
	   {
	}
 }
	
}
class A2 extends Thread
{
	Increments t1 = new Increments();
	A2(Increments t1)
	{
	   this.t1 = t1;
	}
	
	
	public void run()
	{
		t1.increase();
	}
}

public class Exp_9_3 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Increments t1 = new Increments();
		for(int i=0;i<10;i++)
		{
			A2 a1 = new A2(t1);
			a1.start();
		}
		
	}

}
