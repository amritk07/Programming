package exam;
class Table
{
	public synchronized void printTable(int n)
	{
		for(int i =1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
			
		}
	}
	
	
}
class T1 extends Thread{
	Table t ;
	T1(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable(5);
	}
	
}
class T2 extends Thread{
	Table t ;
	T2(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable(10);
	}
	
}

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         T1 t1 = new T1(new Table());
         T2 t2 = new T2(new Table());
         t1.start();
    
		
         t2.start();
	}

}
