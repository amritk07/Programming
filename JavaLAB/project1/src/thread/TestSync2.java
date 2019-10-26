package thread;
class TestTable2
{
	void showTable(int k)
	{
	synchronized(this)
	{
	for(int i=1;i<=5;i++)
	{
	  System.out.println(k*i);
	  try
		{
			Thread.sleep(2000);
		}
	   catch(Exception e)
	   {
		
	   }
	 }
	}
	for(int j=1;j<=5;j++)
	{
		System.out.println(k+j);
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
class MythreadZ extends Thread
{   
	TestTable2 t1;
	MythreadZ(TestTable2 t1)
	{
		this.t1 = t1;
	}
	public void run()
	{
		t1.showTable(5);
	}
}
class MythreadX extends Thread
{   
	TestTable2 t2;
	MythreadX(TestTable2 t2)
	{
		this.t2 = t2;
	}
	public void run()
	{
		t2.showTable(100);
	}
	
}
public class TestSync2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestTable2 obj = new TestTable2();
		MythreadZ t3 = new MythreadZ(obj);
		MythreadX t4 = new MythreadX(obj);
		t3.start();
		t4.start();

	}

}

