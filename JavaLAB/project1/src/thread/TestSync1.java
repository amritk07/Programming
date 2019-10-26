package thread;
class TestTable1
{
	synchronized void showTable(int k)
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
class MythreadC extends Thread
{   
	TestTable1 t1;
	MythreadC(TestTable1 t1)
	{
		this.t1=t1;
	}
	public void run()
	{
		t1.showTable(5);
	}
}
class MythreadE extends Thread
{   
	TestTable1 t2;
	MythreadE(TestTable1 t2)
	{
		this.t2 = t2;
	}
	public void run()
	{
		t2.showTable(100);
	}
	
}
public class TestSync1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestTable1 obj = new TestTable1();
		MythreadC t3 = new MythreadC(obj);
		MythreadE t4 = new MythreadE(obj);
		t3.start();
		t4.start();

	}

}
