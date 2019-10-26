package thread;
class TestTable
{
	void showTable(int k)
	{
	for(int i=1;i<=5;i++)
	{
	  System.out.println(k*i);
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
class MythreadA extends Thread
{   
	TestTable t1;
	MythreadA(TestTable t1)
	{
		this.t1 = t1;
	}
	public void run()
	{
		t1.showTable(5);
	}
}
class MythreadB extends Thread
{   
	TestTable t2;
	MythreadB(TestTable t2)
	{
		this.t2 = t2;
	}
	public void run()
	{
		t2.showTable(100);
	}
	
}
public class TestSyncW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestTable obj = new TestTable();
		MythreadA t3 = new MythreadA(obj);
		MythreadB t4 = new MythreadB(obj);
		t3.start();
		t4.start();

	}

}
